package co.edu.javeriana.ingsoft.pr.model.entidades;


import co.edu.javeriana.ingsoft.pr.model.utilidades.enums.Genero;
import co.edu.javeriana.ingsoft.pr.model.utilidades.enums.OrientacionSexual;

import java.util.Date;
import java.util.List;

public class Periodista extends Persona
{
    private String profesion;
    private long numeroSeguidores;

    public Periodista()
    {
        super();
    }

    public Periodista(String tipoDocumento, String numeroDocumento, String nombres, String apellidos, Date fechaNacimiento, Genero genero, OrientacionSexual orientacionSexual,
                      List<InformacionContacto> informacionContactos, String profesion, long numeroSeguiores)
    {
        super(tipoDocumento, numeroDocumento, nombres, apellidos, fechaNacimiento, genero, orientacionSexual, informacionContactos);
        this.profesion = profesion;
        this.numeroSeguidores = numeroSeguiores;
    }


    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public long getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(long numeroSeguidores) {
        this.numeroSeguidores = numeroSeguidores;
    }
}
