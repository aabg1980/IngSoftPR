package co.edu.javeriana.ingsoft.pr.presentacion.model;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import javafx.beans.property.SimpleStringProperty;

public class PeriodistaView {

    private Periodista periodista;

    public PeriodistaView(Periodista p)
    {
        this.periodista = p;
        this.nombres = new SimpleStringProperty(p.getNombres());
        this.apellidos = new SimpleStringProperty(p.getApellidos());


    }
    private SimpleStringProperty nombres;
    private SimpleStringProperty apellidos;

    public String getNombres() {
        return nombres.getValue();
    }

    public void setNombres(SimpleStringProperty nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos.getValue();
    }

    public void setApellidos(SimpleStringProperty apellidos) {
        this.apellidos = apellidos;
    }
}
