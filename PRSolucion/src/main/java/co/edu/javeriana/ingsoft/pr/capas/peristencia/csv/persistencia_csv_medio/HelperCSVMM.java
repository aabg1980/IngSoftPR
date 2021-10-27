package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.persistencia_csv_medio;

import co.edu.javeriana.ingsoft.pr.core.enums.TipoMedio;
import co.edu.javeriana.ingsoft.pr.core.enums.TipoNoticias;
import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HelperCSVMM {
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

    public Medio crearMedioDeCSV(String[] registroCSV) throws ParseException {
        Medio m = new Medio();
        m.setNombreDeMedio(registroCSV[0]);
        m.setTipoMedio(TipoMedio.valueOf(registroCSV[1]));
        m.setTipoNoticia(TipoNoticias.valueOf(registroCSV[2]));
        return m;
    }
}
