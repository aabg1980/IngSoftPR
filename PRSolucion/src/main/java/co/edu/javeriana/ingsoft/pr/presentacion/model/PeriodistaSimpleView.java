package co.edu.javeriana.ingsoft.pr.presentacion.model;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IFactoryPeriodistaView;

import java.util.ArrayList;

public class PeriodistaSimpleView implements IFactoryPeriodistaView {

    public void imprimir(ArrayList<Periodista> periodistas){
        for(Periodista aux:periodistas){
            System.out.println("Nombres Periodista: "+aux.getNombres());
            System.out.println("Apellidos Periodista: " + aux.getApellidos());
            System.out.println("Documento: " + aux.getTipoDocumento()+". "+aux.getNumeroDocumento());
            System.out.println("Número de seguidores " + aux.getNumeroSeguidores()+"\n");
        }

    }

    public String tipo(){
        return "Simple";
    }
}
