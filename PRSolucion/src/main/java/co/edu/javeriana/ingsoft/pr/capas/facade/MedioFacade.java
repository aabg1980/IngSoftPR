package co.edu.javeriana.ingsoft.pr.capas.facade;

import co.edu.javeriana.ingsoft.pr.capas.negocio.GestionMediosConsultas;
import co.edu.javeriana.ingsoft.pr.capas.negocio.GestionPeriodistasConsultas;
import co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.persistencia_csv_medio.ManejadorMedioConsultasCSV;
import co.edu.javeriana.ingsoft.pr.capas.peristencia.csv.persistencia_csv_periodista.ManejadorPeriodistaConsultasCSV;
import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.facade.IMediosFacade;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionMediosConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionPeriodistasConsultas;

import java.util.List;

public class MedioFacade implements IMediosFacade {

    IGestionMediosConsultas consultasManager;

    public MedioFacade()
    {
        consultasManager = new GestionMediosConsultas();
        consultasManager.setImplementacionPersistencia(new ManejadorMedioConsultasCSV());
    }

    @Override
    public List<Medio> consultarMedios() {
        return consultasManager.consultarMedios();
    }
}
