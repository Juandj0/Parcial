/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author El PcGamer
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner lectura = new Scanner (System.in);
           Programacion programa= new Programacion();
            
            
        int opcion;
        int opcion2;
        int continuar = 1;
        do{
            System.out.println("Programacion de funciones");
//            System.out.println("DIA: " + x.getDia()+ " de " + x.getMes().getNombre());
//            System.out.println("MENU:");
//            System.out.println(" ");
        System.out.println("1: Agendar funcion");
          System.out.println("2: Mostrar informacion programacion entera");
//            System.out.println("2. Inventarios.");
//            System.out.println("3. Proovedores / Facturas.");
//            System.out.println("4. Nomina.");
//            System.out.println("5. Pasar al dia siguiente.");
            System.out.println(" ");
            opcion = lectura.nextInt();
            
            if (opcion==1){
                     System.out.println("Nombre de sala:");
                    String nombresala=lectura.next();
                      System.out.println("Semana numero(ingresar ejemplo:Semana numero 1): ");
                     String nombreSemana = lectura.next();
                        System.out.println("Fecha: ");
                       String fecha= lectura.next();
                        System.out.println(" nombre Dia :");
                       String dia= lectura.next();
                        System.out.println("Hora inicio: ");
                      String horainicio= lectura.next();
                        System.out.println("Hora final: ");
                      String horafinal= lectura.next();
                       programa.addSalaSemanaDiaSegmento(nombresala,nombreSemana, fecha, dia, horainicio, horafinal);//;
                       programa.programacionEntera();
                      
        
        
        
        // TODO code application logic here
    }else if(opcion==2){
      System.out.println("Programacion entera:");
      programa.programacionEntera();
    }else{
       System.out.println("OPCION INVALIDA ");      }
        } while(continuar==1);
    }
}