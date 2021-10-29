package co.edu.javeriana.ingsoft.pr.core.modelo;

public class DetallesPeriodistaSingleton {

    private String tipDoc;
    private String numDoc;
    private String nombreCompleto;
    private String fechaNac;
    private long seguidores;
    private boolean encontrado = false;
    private static DetallesPeriodistaSingleton periodista;

    private DetallesPeriodistaSingleton(){

    }
    public static DetallesPeriodistaSingleton getInstance(){
        if(periodista == null){
            periodista = new DetallesPeriodistaSingleton();
        }
        return periodista;
    }

    public long getSeguidores() {
        return seguidores;
    }
    public String getFechaNac() {
        return fechaNac;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public String getTipDoc() {
        return tipDoc;
    }

    public void setFechaNac(String FechaNac) {
        fechaNac = FechaNac;
    }

    public void setNombreCompleto(String NombreCompleto) {
        nombreCompleto = NombreCompleto;
    }

    public void setNumDoc(String NumDoc) {
        numDoc = NumDoc;
    }

    public void setSeguidores(long seguidores) {
        this.seguidores = seguidores;
    }

    public void setTipDoc(String TipDoc) {
        tipDoc = TipDoc;
    }

    public boolean isEncontrado() {
        return encontrado;
    }
    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }
}
