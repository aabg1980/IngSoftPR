package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.persistencia_csv_medio;

import co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.persistencia_csv_periodista.CacheManagerSingleton;
import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.ArrayList;
import java.util.List;

public class CacheManagerSingletonMM {
    private static CacheManagerSingletonMM instance = null;
    private List<Medio> cacheMedios;

    private CacheManagerSingletonMM()
    {
        cacheMedios = new ArrayList<Medio>();
    }

    public List<Medio> getCacheMedios() {
        return cacheMedios;
    }

    public void cargarCacheMedios(List<Medio> medioList)
    {
        cacheMedios = medioList;
    }

    public static CacheManagerSingletonMM getInstance()
    {
        if(instance==null)
            instance = new CacheManagerSingletonMM();
        return instance;
    }
}
