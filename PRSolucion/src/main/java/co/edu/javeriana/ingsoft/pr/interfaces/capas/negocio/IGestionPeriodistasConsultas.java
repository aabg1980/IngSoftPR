package co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasConsultas;

import java.util.List;

public interface IGestionPeriodistasConsultas {

    /**
     * Consultar lista de periodistas, ordenados alfabeticamente
     * */
    List<Periodista> consultarPeriodistas();

    void setImplementacionPersistencia(IPersistenciaPeriodistasConsultas persistencia);
}
