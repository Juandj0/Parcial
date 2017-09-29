/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author El PcGamer
 */
public class Semana {
    private String nombre;
    private Dia[] dias;
    private int numerodias;

    public int getNumerodias() {
        return numerodias;
    }

    public void setNumerodias(int numerodias) {
        this.numerodias = numerodias;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
       
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }
    public Semana(String nombre) {
        this.nombre = nombre;
        this.dias= new Dia[5];
        this.numerodias=0;
    }
    
    
    public void addDiaSegmento(String fecha,String nombre,String horainicio, String horafinal ){
        Dia dia= new Dia(fecha,nombre);
          if(this.numerodias < 5){
         this.dias[this.numerodias] =dia;
          this.dias[this.numerodias].addSegmento(horainicio, horafinal);
         this.numerodias++;
         // void return true;
      //}else 
        // void  return false;
        }
   
      }
    
    
}