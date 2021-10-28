package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasConsultas;
import co.edu.javeriana.ingsoft.pr.util.config.PropertiesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ManejadorPeriodistaConsultasCSV implements IPersistenciaPeriodistasConsultas {

    CacheManagerSingleton cache;


    @Override
    public List<Periodista> consultarListaPeriodistas() {
        cache = CacheManagerSingleton.getInstance();
        if(cache.getCachePeriodistas().size()==0)
        {
            long timeInicial = System.currentTimeMillis();
            cache.cargarCachePeriodistas(cargarDesdeArchivo());
            long timeFinal = System.currentTimeMillis();

            System.out.println("La carga desde archivo tarda: " + (timeFinal - timeInicial));
        }
        return cache.getCachePeriodistas();
    }


    private List<Periodista> cargarDesdeArchivo()
    {
        HelperCSV helperCSV = new HelperCSV();
        PropertiesReader pr = new PropertiesReader();
        BufferedReader csvReader = helperCSV.abrirArchivoLectura(pr.getFilePath());
        List<Periodista> misPeriodistas = new ArrayList<Periodista>();
        String row;
        int rowNumber = 0;
        while (true) {
            try {
                if (!(( row = csvReader.readLine()) != null)) break;
                String[] data = row.split(",");
                rowNumber++;
                if(rowNumber > 1) {
                    Periodista periodista = null;
                    try {
                        periodista = helperCSV.crearPeriodistaDeCSV(data);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    misPeriodistas.add(periodista);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        helperCSV.cerrarArchivoLectura(csvReader);
        return misPeriodistas;
    }
}
