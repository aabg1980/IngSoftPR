package co.edu.javeriana.ingsoft.pr.presentacion.general;

import co.edu.javeriana.ingsoft.pr.capas.facade.ConsultaDetallesFacade;
import co.edu.javeriana.ingsoft.pr.core.modelo.DetallesPeriodistaSingleton;
import co.edu.javeriana.ingsoft.pr.presentacion.model.VistaDetalles;


public class ConsultaDetallesController {
    ConsultaDetallesFacade facade = new ConsultaDetallesFacade();

    public void inicio(){
        String nombreArchivo = "periodistas.csv";
        VistaDetalles vista = new VistaDetalles();

        DetallesPeriodistaSingleton periodista = DetallesPeriodistaSingleton.getInstance();

        facade.consultarDetalles(nombreArchivo, periodista);

        if(periodista.isEncontrado()){
            vista.imprimirDetalles(periodista);
        }else
            vista.imprimirError(periodista);


    }
}
