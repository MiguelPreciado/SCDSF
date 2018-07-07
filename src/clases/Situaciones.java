/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author JP
 */
public class Situaciones { 
   private int idSituacion; 
   private int idTrabajador; 
   private String horarioSituacion; 
   private String areaSituacion; 
   private String turnoSituacion; 
   private String tipoSituacion; 
   private String descripcionSituacion; 
   private String fechaSituacion; 

    public Situaciones() {
    }

    public Situaciones(int idSituacion, int idTrabajador, String horarioSituacion, String areaSituacion, String turnoSituacion, String tipoSituacion, String descripcionSituacion, String fechaSituacion) {
        this.idSituacion = idSituacion;
        this.idTrabajador = idTrabajador;
        this.horarioSituacion = horarioSituacion;
        this.areaSituacion = areaSituacion;
        this.turnoSituacion = turnoSituacion;
        this.tipoSituacion = tipoSituacion;
        this.descripcionSituacion = descripcionSituacion;
        this.fechaSituacion = fechaSituacion;
    }

    

    public int getIdSituacion() {
        return idSituacion;
    }

    public void setIdSituacion(int idSituacion) {
        this.idSituacion = idSituacion;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getHorarioSituacion() {
        return horarioSituacion;
    }

    public void setHorarioSituacion(String horarioSituacion) {
        this.horarioSituacion = horarioSituacion;
    }

    public String getAreaSituacion() {
        return areaSituacion;
    }

    public void setAreaSituacion(String areaSituacion) {
        this.areaSituacion = areaSituacion;
    }

    public String getTurnoSituacion() {
        return turnoSituacion;
    }

    public void setTurnoSituacion(String turnoSituacion) {
        this.turnoSituacion = turnoSituacion;
    }

    public String getTipoSituacion() {
        return tipoSituacion;
    }

    public void setTipoSituacion(String tipoSituacion) {
        this.tipoSituacion = tipoSituacion;
    }

    public String getDescripcionSituacion() {
        return descripcionSituacion;
    }

    public void setDescripcionSituacion(String descripcionSituacion) {
        this.descripcionSituacion = descripcionSituacion;
    }

    public String getFechaSituacion() {
        return fechaSituacion;
    }

    public void setFechaSituacion(String fechaSituacion) {
        this.fechaSituacion = fechaSituacion;
    }
   
            
    
}
