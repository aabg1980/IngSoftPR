package co.edu.javeriana.ingsoft.pr.interfaces.capas.facade;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.List;

/**
 * @author Mau y Ange
 * Facade de medios
 * */
public interface IMediosFacade {
    List<Medio> consultarMedios();
}
