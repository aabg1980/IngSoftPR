package co.edu.javeriana.ingsoft.pr.core.modelo;

import java.util.Date;

public class Medio {
    private String atributo1;
    private String atributo2;

    public Medio()
    {
        super();
    }

    public Medio(String x, String y, String z, String apellidos, Date fechaInicio)
    {
        this.atributo1 = x;
        this.atributo2 = y;
    }

    public String getNombres()
    {
        return this.getAtributo1();
    }



    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }
}
