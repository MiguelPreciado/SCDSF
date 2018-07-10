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
public class Trabajadores {
    private int idTrabajador; 
    private String nombreTrabajador; 
    private String apPatTrabajador; 
    private String apMatTrabajador; 
    private String calleTrabajador; 
    private String noIntTrabajador; 
    private String noExtTrabajador; 
    private String estadoTrabajador;  
    private String municipioTrabajador; 
    private String telefonoTrabajador; 
    private String correoTrabajador; 
    private String universidadProcedencia; 
    private String fechaInicio; 
    private String fechaTermino; 
    private String horarioAsignadoPasante; 
    private String turnoTrabajador; 
    private String jornadaTrabajador; 
    private int matriculaPasante; 
    private String tipoTrabajador; 
    private String especialidad; 
    private int horasRegistradas;  
    private String areaAsignada; 
    private String observaciones; 
    private String statusTrabajador; 
    private String claseTrabajador; 

    public Trabajadores() {
    }

    public Trabajadores(int idTrabajador, String nombreTrabajador, String apPatTrabajador, String apMatTrabajador, String calleTrabajador, String noIntTrabajador, String noExtTrabajador, String estadoTrabajador, String municipioTrabajador, String telefonoTrabajador, String correoTrabajador, String universidadProcedencia, String fechaInicio, String fechaTermino, String horarioAsignadoPasante, String turnoTrabajador, String jornadaTrabajador, int matriculaPasante, String tipoTrabajador, String especialidad, int horasRegistradas, String areaAsignada, String observaciones, String statusTrabajador, String claseTrabajador) {
        this.idTrabajador = idTrabajador;
        this.nombreTrabajador = nombreTrabajador;
        this.apPatTrabajador = apPatTrabajador;
        this.apMatTrabajador = apMatTrabajador;
        this.calleTrabajador = calleTrabajador;
        this.noIntTrabajador = noIntTrabajador;
        this.noExtTrabajador = noExtTrabajador;
        this.estadoTrabajador = estadoTrabajador;
        this.municipioTrabajador = municipioTrabajador;
        this.telefonoTrabajador = telefonoTrabajador;
        this.correoTrabajador = correoTrabajador;
        this.universidadProcedencia = universidadProcedencia;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.horarioAsignadoPasante = horarioAsignadoPasante;
        this.turnoTrabajador = turnoTrabajador;
        this.jornadaTrabajador = jornadaTrabajador;
        this.matriculaPasante = matriculaPasante;
        this.tipoTrabajador = tipoTrabajador;
        this.especialidad = especialidad;
        this.horasRegistradas = horasRegistradas;
        this.areaAsignada = areaAsignada;
        this.observaciones = observaciones;
        this.statusTrabajador = statusTrabajador;
        this.claseTrabajador = claseTrabajador;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getApPatTrabajador() {
        return apPatTrabajador;
    }

    public void setApPatTrabajador(String apPatTrabajador) {
        this.apPatTrabajador = apPatTrabajador;
    }

    public String getApMatTrabajador() {
        return apMatTrabajador;
    }

    public void setApMatTrabajador(String apMatTrabajador) {
        this.apMatTrabajador = apMatTrabajador;
    }

    public String getCalleTrabajador() {
        return calleTrabajador;
    }

    public void setCalleTrabajador(String calleTrabajador) {
        this.calleTrabajador = calleTrabajador;
    }

    public String getNoIntTrabajador() {
        return noIntTrabajador;
    }

    public void setNoIntTrabajador(String noIntTrabajador) {
        this.noIntTrabajador = noIntTrabajador;
    }

    public String getNoExtTrabajador() {
        return noExtTrabajador;
    }

    public void setNoExtTrabajador(String noExtTrabajador) {
        this.noExtTrabajador = noExtTrabajador;
    }

    public String getEstadoTrabajador() {
        return estadoTrabajador;
    }

    public void setEstadoTrabajador(String estadoTrabajador) {
        this.estadoTrabajador = estadoTrabajador;
    }

    public String getMunicipioTrabajador() {
        return municipioTrabajador;
    }

    public void setMunicipioTrabajador(String municipioTrabajador) {
        this.municipioTrabajador = municipioTrabajador;
    }

    public String getTelefonoTrabajador() {
        return telefonoTrabajador;
    }

    public void setTelefonoTrabajador(String telefonoTrabajador) {
        this.telefonoTrabajador = telefonoTrabajador;
    }

    public String getCorreoTrabajador() {
        return correoTrabajador;
    }

    public void setCorreoTrabajador(String correoTrabajador) {
        this.correoTrabajador = correoTrabajador;
    }

    public String getUniversidadProcedencia() {
        return universidadProcedencia;
    }

    public void setUniversidadProcedencia(String universidadProcedencia) {
        this.universidadProcedencia = universidadProcedencia;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getHorarioAsignadoPasante() {
        return horarioAsignadoPasante;
    }

    public void setHorarioAsignadoPasante(String horarioAsignadoPasante) {
        this.horarioAsignadoPasante = horarioAsignadoPasante;
    }

    public String getTurnoTrabajador() {
        return turnoTrabajador;
    }

    public void setTurnoTrabajador(String turnoTrabajador) {
        this.turnoTrabajador = turnoTrabajador;
    }

    public String getJornadaTrabajador() {
        return jornadaTrabajador;
    }

    public void setJornadaTrabajador(String jornadaTrabajador) {
        this.jornadaTrabajador = jornadaTrabajador;
    }

    public int getMatriculaPasante() {
        return matriculaPasante;
    }

    public void setMatriculaPasante(int matriculaPasante) {
        this.matriculaPasante = matriculaPasante;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasRegistradas() {
        return horasRegistradas;
    }

    public void setHorasRegistradas(int horasRegistradas) {
        this.horasRegistradas = horasRegistradas;
    }

    public String getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getStatusTrabajador() {
        return statusTrabajador;
    }

    public void setStatusTrabajador(String statusTrabajador) {
        this.statusTrabajador = statusTrabajador;
    }

    public String getClaseTrabajador() {
        return claseTrabajador;
    }

    public void setClaseTrabajador(String claseTrabajador) {
        this.claseTrabajador = claseTrabajador;
    }
    
    
    
    
}
