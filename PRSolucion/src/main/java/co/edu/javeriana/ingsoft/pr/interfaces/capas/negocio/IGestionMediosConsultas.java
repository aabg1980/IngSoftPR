package co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaMediosConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasConsultas;

import java.util.List;

public interface IGestionMediosConsultas {

    /**
     * Consultar lista de Medioss, ordenados alfabeticamente
     * */
    List<Medio> consultarMedios();

    void setImplementacionPersistencia(IPersistenciaMediosConsultas persistencia);
}
