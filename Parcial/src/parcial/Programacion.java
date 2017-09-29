/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author Juan David Jaime Huerfano
 */
public class Programacion {
    private String nombre;
    private ArrayList<Sala> salas; 
    private int numerosalas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public Programacion() {
        
       this.salas=new ArrayList();
       this.numerosalas=0;
    }
    
    
    public void addSalaSemanaDiaSegmento(String nombresala,String nombref,String fecha,String nombre,String horainicio, String horafinal){//){
      Sala sala=new Sala(nombresala);  
    this.salas.add(sala);
    
    this.salas.get(this.numerosalas).agregarSemanaDiaSegmento(nombref,fecha,nombre,horainicio,horafinal);
    this.numerosalas++;
        
        
        
    }
    public void programacionEntera(){
        System.out.println("Programacion");
        System.out.println(" ");
        for(int i=0; i<this.salas.size();i++){
             System.out.println("Sala: "+this.salas.get(i).getNombre());
              System.out.println(" ");
             for(int j=0; j<this.salas.get(i).getSemanas().size();j++){
                 System.out.println("Semana: "+this.salas.get(i).getSemanas().get(j).getNombre());
                 System.out.println(" ");
                 for(int k=0; k<5;k++){
                     if(this.salas.get(i).getSemanas().get(j).getDias()[k]!=null){
                     System.out.println(this.salas.get(i).getSemanas().get(j).getDias()[k].getNombre()); 
                      System.out.println(" ");
                      for(int d=0; d<this.salas.get(i).getSemanas().get(j).getDias()[k].getSegmentos().size();d++){
                           System.out.println("Funcion programada:");  
                         System.out.println("Hora inicio "+ this.salas.get(i).getSemanas().get(j).getDias()[k].getSegmentos().get(d).getHorainicio());
                            System.out.println("Hora fin "+ this.salas.get(i).getSemanas().get(j).getDias()[k].getSegmentos().get(d).getHorafin());
                               System.out.println(" ");
                     }
                 
                 }
                 
             }
         System.out.println("_____________________");
        
        }
           System.out.println("_____________________");
        
    }
}
}