package co.edu.javeriana.ingsoft.pr.core.modelo;

import co.edu.javeriana.ingsoft.pr.core.enums.TipoMedio;
import co.edu.javeriana.ingsoft.pr.core.enums.TipoNoticias;

public class Medio {
    private String nombreDeMedio;
    private TipoMedio tipoMedio;
    private TipoNoticias tipoNoticia;

    public Medio() {
    }

    public Medio(String nombreDeMedio, TipoMedio tipoMedio, TipoNoticias tipoNoticia) {
        this.nombreDeMedio = nombreDeMedio;
        this.tipoMedio = tipoMedio;
        this.tipoNoticia = tipoNoticia;
    }

    public String getNombreDeMedio() {
        return nombreDeMedio;
    }

    public void setNombreDeMedio(String nombreDeMedio) {
        this.nombreDeMedio = nombreDeMedio;
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    public TipoNoticias getTipoNoticia() {
        return tipoNoticia;
    }

    public void setTipoNoticia(TipoNoticias tipoNoticia) {
        this.tipoNoticia = tipoNoticia;
    }
}
