package co.edu.javeriana.ingsoft.pr.core.modelo;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaArchivo {

    private BufferedReader lector;
    private String linea;
    private String partes[] = null;

    public boolean leerArchivo(String nombre, DetallesPeriodistaSingleton periodista){

        try{
            lector = new BufferedReader(new FileReader(nombre));
            while((linea = lector.readLine()) != null){
                partes = linea.split( ",");

                if(verificar(partes, periodista)){

                    periodista.setTipDoc(partes[0]);
                    periodista.setNombreCompleto(partes[2]);
                    periodista.setFechaNac(partes[3]);
                    periodista.setSeguidores(Long.parseLong(partes[4]));

                    return true;
                }
            }
            lector.close();
            linea = null;
            partes = null;
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return false;
    }
    public boolean verificar(String []partes, DetallesPeriodistaSingleton periodista){

        if(partes[1].equals(periodista.getNumDoc())){

            periodista.setEncontrado(true);
            return true;
        }
        return false;
    }

}

