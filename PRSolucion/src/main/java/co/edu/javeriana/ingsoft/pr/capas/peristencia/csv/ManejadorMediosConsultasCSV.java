package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaMediosConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasConsultas;
import co.edu.javeriana.ingsoft.pr.util.config.PropertiesReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ManejadorMediosConsultasCSV implements IPersistenciaMediosConsultas {

    CacheManagerSingleton cache;



    @Override
    public List<Medio> consultarListaMedios() {
        cache = CacheManagerSingleton.getInstance();
        if(cache.getCacheMedios().size()==0)
        {
            long timeInicial = System.currentTimeMillis();

            cache.cargarCacheMedios(cargarDesdeArchivo());
            long timeFinal = System.currentTimeMillis();

            System.out.println("La carga desde archivo tarda: " + (timeFinal - timeInicial));
        }
        return cache.getCacheMedios();
    }



    private List<Medio> cargarDesdeArchivo()
    {
        HelperCSV helperCSV = new HelperCSV();
        PropertiesReader pr = new PropertiesReader();
        BufferedReader csvReader = helperCSV.abrirArchivoLectura(pr.getFilePathM());
        List<Medio> misMedios = new ArrayList<Medio>();
        String row;
        int rowNumber = 0;
        while (true) {
            try {
                if (!(( row = csvReader.readLine()) != null)) break;
                String[] data = row.split(",");
                rowNumber++;
                if(rowNumber > 1) {
                    Medio medio = null;
                    try {
                        medio = helperCSV.crearMedioDeCSV(data);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    misMedios.add(medio);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        helperCSV.cerrarArchivoLectura(csvReader);
        return misMedios;
    }
}
