package co.edu.javeriana.ingsoft.pr.core.modelo;



import co.edu.javeriana.ingsoft.pr.core.enums.Genero;
import co.edu.javeriana.ingsoft.pr.core.enums.OrientacionSexual;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa una persona
 * @author aabg1980
 * */
public class Persona implements Serializable {

    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private Genero genero;
    private OrientacionSexual orientacionSexual;
    private List<InformacionContacto> informacionContactoList;

    public Persona()
    {
        informacionContactoList = new ArrayList<InformacionContacto>();
    }

    /**
     * Constructor con parametros
     * */
    public Persona(String tipoDocumento, String numeroDocumento, String nombres, String apellidos, Date fechaNacimiento, Genero genero, OrientacionSexual orientacionSexual, List<InformacionContacto> informacionContactos)
    {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.orientacionSexual = orientacionSexual;
        this.informacionContactoList = informacionContactos;
                
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public OrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public void setOrientacionSexual(OrientacionSexual orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public List<InformacionContacto> getInformacionContactoList() {
        return informacionContactoList;
    }

    public void setInformacionContactoList(List<InformacionContacto> informacionContactoList) {
        this.informacionContactoList = informacionContactoList;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
