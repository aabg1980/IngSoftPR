package co.edu.javeriana.ingsoft.pr.presentacion.model;

import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IFactoryPeriodistaView;

public class FabricaPeriodistaView {

    public static IFactoryPeriodistaView construir(String tipo){
        switch(tipo){
            case "Simple":
                return new PeriodistaSimpleView();
            case "Detailed":
                return new PeriodistaDetailtedView();
            default:
                System.out.println("Error tipo no reconocido por la fabrica");
                return null;
        }
    }

}
