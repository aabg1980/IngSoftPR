package co.edu.javeriana.ingsoft.pr.interfaces.capas.facade;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.List;

/**
 * @author aabg
 * Facade de periodistas
 * */
public interface IPeriodistasFacade {

    /**
     * Consultar lista de periodistas, ordenados alfabeticamente
     * */
    List<Periodista> consultarPeriodistas();
}
