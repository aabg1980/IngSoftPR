package co.edu.javeriana.ingsoft.pr.capas.facade;

import co.edu.javeriana.ingsoft.pr.capas.negocio.GestionPeriodistasConsultas;
import co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.persistencia_csv_periodista.ManejadorPeriodistaConsultasCSV;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.facade.IPeriodistasFacade;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionPeriodistasConsultas;

import java.util.List;

public class PeriodistasFacade implements IPeriodistasFacade {

    IGestionPeriodistasConsultas consultasManager;

    public PeriodistasFacade()
    {
        consultasManager = new GestionPeriodistasConsultas();
        consultasManager.setImplementacionPersistencia(new ManejadorPeriodistaConsultasCSV());
    }

    @Override
    public List<Periodista> consultarPeriodistas() {
        return consultasManager.consultarPeriodistas();
    }
}
