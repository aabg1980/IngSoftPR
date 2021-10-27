package co.edu.javeriana.ingsoft.pr.interfaces.capas.facade;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.List;

/**
 * @author aabg
 * Facade de periodistas
 * */
public interface IMediosFacade {

    /**
     * Consultar lista de periodistas, ordenados alfabeticamente
     * */
    List<Medio> consultarMedios();
}
