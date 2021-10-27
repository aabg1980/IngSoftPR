package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.persistencia_csv_periodista;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HelperCSV {

    private final static String FORMATO_FECHA = "dd/MM/yyyy";

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

    public void cerrarArchivoLectura(BufferedReader cvsReader){
        try {
            cvsReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Periodista crearPeriodistaDeCSV(String[] registroCSV) throws ParseException {
        Periodista p = new Periodista();
        p.setTipoDocumento(registroCSV[0]);
        p.setNumeroDocumento(registroCSV[1]);

        p.setNombres(registroCSV[2].split(" ")[0]);
        p.setApellidos(registroCSV[2].split(" ")[1]);
        p.setFechaNacimiento(new SimpleDateFormat(FORMATO_FECHA).parse(registroCSV[3]));
        p.setNumeroSeguidores(Long.parseLong(registroCSV[4]));
        return p;
    }
}
