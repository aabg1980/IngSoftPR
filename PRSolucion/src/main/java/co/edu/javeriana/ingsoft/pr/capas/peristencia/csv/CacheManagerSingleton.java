package co.edu.javeriana.ingsoft.pr.capas.peristencia.csv;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.ArrayList;
import java.util.List;

public class CacheManagerSingleton {
    private static CacheManagerSingleton instance = null;
    private List<Periodista> cachePeriodistas;
    private List<Medio> cacheMedios;

    private CacheManagerSingleton()
    {
        cachePeriodistas = new ArrayList<Periodista>();
        cacheMedios= new ArrayList<Medio>();
    }

    public List<Periodista> getCachePeriodistas() {
        return cachePeriodistas;
    }
    public List<Medio> getCacheMedios() {
        return cacheMedios;
    }

    public void cargarCachePeriodistas(List<Periodista> periodistaList)
    {
        cachePeriodistas = periodistaList;
    }
    public void cargarCacheMedios(List<Medio> mediosList)
    {
        cacheMedios = mediosList;
    }

    public static CacheManagerSingleton getInstance()
    {
        if(instance==null)
            instance = new CacheManagerSingleton();
        return instance;
    }
}
