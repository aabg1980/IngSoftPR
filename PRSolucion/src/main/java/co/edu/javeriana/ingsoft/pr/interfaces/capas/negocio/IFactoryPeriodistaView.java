package co.edu.javeriana.ingsoft.pr.interfaces.capas.negocio;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.util.ArrayList;

public interface IFactoryPeriodistaView{

    public void imprimir(ArrayList<Periodista> periodistas);

    public String tipo();
}
