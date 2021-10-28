package co.edu.javeriana.ingsoft.pr.capas.negocio;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionPeriodistasConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasConsultas;

import java.util.List;

public class GestionPeriodistasConsultas implements IGestionPeriodistasConsultas {

    IPersistenciaPeriodistasConsultas implementacionPersistencia;
    @Override
    public List<Periodista> consultarPeriodistas() {

        long timeInicial = System.currentTimeMillis();

        List<Periodista> periodistaList = implementacionPersistencia.consultarListaPeriodistas();
        long timeFinal = System.currentTimeMillis();

        System.out.println("La carga tarda: " + (timeFinal - timeInicial));

        return periodistaList;
    }

    @Override
    public void setImplementacionPersistencia(IPersistenciaPeriodistasConsultas persistencia) {
        this.implementacionPersistencia = persistencia;
    }
}
