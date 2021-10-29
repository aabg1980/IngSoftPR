package co.edu.javeriana.ingsoft.pr.presentacion.model;

import co.edu.javeriana.ingsoft.pr.core.modelo.DetallesPeriodistaSingleton;

public class VistaDetalles {
    public void imprimirDetalles(DetallesPeriodistaSingleton periodista){
        System.out.println("-----------------------Búsqueda completa ---------------------");
        System.out.println("Numero Documento " + periodista.getNumDoc());
        System.out.println("Tipo Documento " + periodista.getTipDoc());
        System.out.println("Nombre Completo " + periodista.getNombreCompleto());
        System.out.println("Fecha de nacimiento " + periodista.getFechaNac());
        System.out.println("Numero seguidores " + periodista.getSeguidores());
    }
    public void imprimirError(DetallesPeriodistaSingleton periodista){
        System.out.println("El periodista con número de documento " + periodista.getNumDoc() + " No fue encontrado");
    }
}
