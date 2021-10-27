package co.edu.javeriana.ingsoft.pr.presentacion.model;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import javafx.beans.property.SimpleStringProperty;

public class MedioView {

    private Medio medio;

    public MedioView(Medio m)
    {
        this.medio = m;
        this.nombre = new SimpleStringProperty(m.getAtributo1());
        this.atributo = new SimpleStringProperty(m.getAtributo2());
    }
    private SimpleStringProperty nombre;
    private SimpleStringProperty atributo;

    public String getNombre() {
        return nombre.getValue();
    }

    public void setNombre(SimpleStringProperty nombre) {
        this.nombre = nombre;
    }

    public String getAtributo2() {
        return atributo.getValue();
    }

    public void setAtributo2(SimpleStringProperty atributo2) {
        this.atributo = atributo2;
    }
}