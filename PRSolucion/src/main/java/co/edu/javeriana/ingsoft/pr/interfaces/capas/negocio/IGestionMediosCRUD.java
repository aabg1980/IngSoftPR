package co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaMediosCRUD;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasCRUD;

public interface IGestionMediosCRUD {

    void crearMedio(Periodista periodista);

    void setImplementacionPersistencia(IPersistenciaMediosCRUD implementacionPersistencia);
}
