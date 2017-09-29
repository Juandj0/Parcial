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
public class Dia{
    private String fecha;
    private String nombre;
    private ArrayList<Segmento> segmentos;

    public Dia(String fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.segmentos=new ArrayList();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList<Segmento> segmentos) {
        this.segmentos = segmentos;
    }
    
    public void addSegmento(String horainicio, String horafinal){
    
        this.segmentos.add(new Segmento(horainicio,horafinal));
        
        
    }
}
