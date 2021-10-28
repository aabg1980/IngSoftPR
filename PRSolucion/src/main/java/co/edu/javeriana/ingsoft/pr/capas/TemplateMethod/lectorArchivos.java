package co.edu.javeriana.ingsoft.pr.capas.TemplateMethod;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lectorArchivos {

    public lectorArchivos() {
    }

    public BufferedReader abrirArchivoLectura(String path)
    {
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader(path));
            return csvReader;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public void cerrarArchivoLectura(BufferedReader cvsReader) {
        try {
            cvsReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
