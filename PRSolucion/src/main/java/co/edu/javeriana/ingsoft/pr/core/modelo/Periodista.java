package co.edu.javeriana.ingsoft.pr.core.modelo;



import co.edu.javeriana.ingsoft.pr.core.enums.Genero;
import co.edu.javeriana.ingsoft.pr.core.enums.OrientacionSexual;

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

    public Periodista(String tipoDocumento, String numeroDocumento, String nombres, String apellidos, Date fechaNacimiento, long numeroSeguiores)
    {
        super(tipoDocumento, numeroDocumento, nombres, apellidos, fechaNacimiento);
        this.numeroSeguidores = numeroSeguiores;
    }

    @Override
    public String getNombres()
    {
        return super.getNombres();
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

    public Periodista clonar(){
        Periodista periodista=new Periodista();
        try{
            periodista=(Periodista) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return periodista;
    }
}

