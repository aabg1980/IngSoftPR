package co.edu.javeriana.ingsoft.pr.presentacion.model;

import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LeerPeriodista {
    private final static String FORMATO_FECHA = "dd/MM/yyyy";
    public static Periodista leer(){
        Scanner in=new Scanner(System.in);
        Periodista periodista;
        System.out.println("Digite la información del periodista: ");
        System.out.println("Digite el tipo de documento");
        String tipoDoc=in.nextLine();
        System.out.println("Digite el numero de documento");
        String documento=in.nextLine();
        System.out.println("Digite los nombres");
        String nombre=in.nextLine();
        System.out.println("Digite los apellidos");
        String apellido=in.nextLine();
        System.out.println("Digite la fecha de nacimiento");
        String fecha=in.nextLine();
        System.out.println("Digite la cantidad de seguidores");
        Long seguidores = in.nextLong();
        try{
             Date fechaDate= new SimpleDateFormat(FORMATO_FECHA).parse(fecha);
             periodista=new Periodista(tipoDoc, documento, nombre,apellido,fechaDate, seguidores );
        }catch (Exception e) {
            periodista=new Periodista();
            e.printStackTrace();
        }
        return periodista;
    }
}
