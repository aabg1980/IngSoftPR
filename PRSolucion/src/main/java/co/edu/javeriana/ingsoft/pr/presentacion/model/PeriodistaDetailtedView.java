package co.edu.javeriana.ingsoft.pr.presentacion.model;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IFactoryPeriodistaView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PeriodistaDetailtedView implements IFactoryPeriodistaView {
    public void imprimir(ArrayList<Periodista> periodistas){
        for(Periodista aux:periodistas){
            System.out.println("Nombres Periodista: "+aux.getNombres());
            System.out.println("Apellidos Periodista: " + aux.getApellidos());
            System.out.println("Tipo de documento: " + aux.getTipoDocumento());
            System.out.println("Documento: "+aux.getNumeroDocumento());
            String srtDateFormat="dd-MMM-yyyy";
            SimpleDateFormat fechaSDF= new SimpleDateFormat(srtDateFormat);
            System.out.println("Fecha de nacimiento " + fechaSDF.format(aux.getFechaNacimiento()));
            System.out.println("Número de seguidores " + aux.getNumeroSeguidores()+"\n");
        }

    }

    public String tipo(){
        return "Detailed";
    }
}
