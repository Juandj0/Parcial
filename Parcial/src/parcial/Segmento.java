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
public class Segmento {
    private String horainicio;
    private String horafin;
          
    public Segmento(String horainicio, String horafin) {
        this.horainicio = horainicio;
        this.horafin = horafin;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }
    
}
