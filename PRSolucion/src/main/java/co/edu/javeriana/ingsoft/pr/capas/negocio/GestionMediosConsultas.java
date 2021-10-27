package co.edu.javeriana.ingsoft.pr.capas.negocio;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionMediosConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio.IGestionPeriodistasConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaMediosConsultas;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia.IPersistenciaPeriodistasConsultas;

import java.util.List;

public class GestionMediosConsultas implements IGestionMediosConsultas {

    IPersistenciaMediosConsultas implementacionPersistencia;
    @Override
    public List<Medio> consultarMedios() {

        long timeInicial = System.currentTimeMillis();

        List<Medio> mediosList = implementacionPersistencia.consultarListaMedios();
        long timeFinal = System.currentTimeMillis();

        System.out.println("La carga tarda: " + (timeFinal - timeInicial));


        return mediosList;
    }

    @Override
    public void setImplementacionPersistencia(IPersistenciaMediosConsultas persistencia) {
        this.implementacionPersistencia = persistencia;
    }
}
