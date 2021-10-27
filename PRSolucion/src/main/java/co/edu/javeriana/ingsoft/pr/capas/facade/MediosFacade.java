package co.edu.javeriana.ingsoft.pr.capas.facade;

import co.edu.javeriana.ingsoft.pr.capas.negocio.GestionMediosConsultas;
import co.edu.javeriana.ingsoft.pr.capas.negocio.GestionPeriodistasConsultas;
import co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.ManejadorMediosConsultasCSV;
import co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.ManejadorPeriodistaConsultasCSV;
import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.facade.IMediosFacade;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.facade.IPeriodistasFacade;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionMediosConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionPeriodistasConsultas;

import java.util.List;

public class MediosFacade implements IMediosFacade {

    IGestionMediosConsultas consultasManager;

    public MediosFacade()
    {
        consultasManager = new GestionMediosConsultas();
        consultasManager.setImplementacionPersistencia(new ManejadorMediosConsultasCSV());
    }

    @Override
    public List<Medio> consultarMedios() {
        return consultasManager.consultarMedios();
    }
}
