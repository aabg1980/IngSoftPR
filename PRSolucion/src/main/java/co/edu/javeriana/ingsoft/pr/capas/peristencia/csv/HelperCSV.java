package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv;

import co.edu.javeriana.ingsoft.pr.capas.TemplateMethod.lectorArchivos;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HelperCSV extends lectorArchivos {

    private final static String FORMATO_FECHA = "dd/MM/yyyy";

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
