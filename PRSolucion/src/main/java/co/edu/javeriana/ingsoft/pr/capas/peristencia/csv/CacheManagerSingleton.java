package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.ArrayList;
import java.util.List;

public class CacheManagerSingleton {
    private static CacheManagerSingleton instance = null;
    private List<Periodista> cachePeriodistas;

    private CacheManagerSingleton()
    {
        cachePeriodistas = new ArrayList<Periodista>();
    }

    public List<Periodista> getCachePeriodistas() {
        return cachePeriodistas;
    }

    public void cargarCachePeriodistas(List<Periodista> periodistaList)
    {
        cachePeriodistas = periodistaList;
    }

    public static CacheManagerSingleton getInstance()
    {
        if(instance==null)
            instance = new CacheManagerSingleton();
        return instance;
    }
}
