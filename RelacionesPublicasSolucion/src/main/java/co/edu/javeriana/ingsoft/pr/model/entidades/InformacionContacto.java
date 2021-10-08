package co.edu.javeriana.ingsoft.pr.model.entidades;

import co.edu.javeriana.ingsoft.pr.model.utilidades.enums.TipoInformacionContacto;

import java.io.Serializable;

/**
 * Tipo de informacion de contacto
 * email, telefono, direccion y otros
 * * */
public class InformacionContacto implements Serializable {

    private String valor;
    private String descripcion;
    private TipoInformacionContacto tipoInformacionContacto;

    public InformacionContacto(String valor, String descripcion, TipoInformacionContacto tipoInformacionContacto)
    {
        this.setValor(valor);
        this.setDescripcion(descripcion);
        this.setTipoInformacionContacto(tipoInformacionContacto);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoInformacionContacto getTipoInformacionContacto() {
        return tipoInformacionContacto;
    }

    public void setTipoInformacionContacto(TipoInformacionContacto tipoInformacionContacto) {
        this.tipoInformacionContacto = tipoInformacionContacto;
    }
}
