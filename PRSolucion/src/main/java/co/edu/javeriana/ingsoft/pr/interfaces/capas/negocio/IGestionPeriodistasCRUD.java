package co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasCRUD;

public interface IGestionPeriodistasCRUD {

    void crearPeriodista(Periodista periodista);

    void setImplementacionPersistencia(IPersistenciaPeriodistasCRUD implementacionPersistencia);
}
