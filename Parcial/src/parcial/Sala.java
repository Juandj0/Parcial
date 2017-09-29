/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author El PcGamer
 */
public class Sala {
    private String nombre;
    private ArrayList<Semana> semanas; 
    private int numerosemanas;
    public Sala(String nombre) {
        this.nombre = nombre;
        this.semanas= new ArrayList();
        this.numerosemanas=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }
    public void agregarSemanaDiaSegmento(String nombreSemana,String fecha,String nombre,String horainicio, String horafinal){
         this.semanas.add(new Semana(nombreSemana));
          this.semanas.get(this.numerosemanas).addDiaSegmento(fecha, nombre, horainicio, horafinal);
          this.numerosemanas++;         
         
     // this.semanas.add(new Semana(nombref).addDiaSegmento(fecha, nombre, horainicio, horafinal));
      
        
    
    
    }
  
}
