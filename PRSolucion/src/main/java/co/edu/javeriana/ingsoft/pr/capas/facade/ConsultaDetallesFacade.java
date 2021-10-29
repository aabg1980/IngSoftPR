package co.edu.javeriana.ingsoft.pr.capas.facade;

import co.edu.javeriana.ingsoft.pr.core.modelo.DetallesPeriodistaSingleton;
import co.edu.javeriana.ingsoft.pr.core.modelo.LecturaArchivo;
import co.edu.javeriana.ingsoft.pr.core.modelo.PedirDatos;

public class ConsultaDetallesFacade {

    PedirDatos pedirDatos = new PedirDatos();
    LecturaArchivo archivo = new LecturaArchivo();

    public void consultarDetalles(String nombreArchivo, DetallesPeriodistaSingleton periodista) {

        periodista.setNumDoc(pedirDatos.pedir());
        archivo.leerArchivo(nombreArchivo, periodista);

    }
}
