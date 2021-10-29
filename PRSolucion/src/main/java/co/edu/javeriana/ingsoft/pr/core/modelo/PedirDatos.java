package co.edu.javeriana.ingsoft.pr.core.modelo;

import java.util.Scanner;

public class PedirDatos {
    public String pedir(){
        Scanner sc = new Scanner(System.in);
        String dato;
        System.out.println("Ingrese numero de identificacion del periodista a buscar");
        dato = sc.next();
        return dato;
    }
}
