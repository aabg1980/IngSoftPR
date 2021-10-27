package co.edu.javeriana.ingsoft.pr.interfaces.capas.persistencia;

import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.List;

public interface IPersistenciaMediosConsultas {
    List<Medio> consultarListaMedios();
}
