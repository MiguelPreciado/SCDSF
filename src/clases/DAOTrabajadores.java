/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JP
 */
public class DAOTrabajadores extends Trabajadores {
    private String mensaje;
    Connection con;

    public DAOTrabajadores() {
    }
    
    
    public DAOTrabajadores(
            int idTrabajador, 
     String nombreTrabajador, 
     String apPatTrabajador, 
     String apMatTrabajador, 
     String calleTrabajador, 
     String noIntTrabajador, 
     String noExtTrabajador, 
     String estadoTrabajador,  
     String municipioTrabajador, 
     String telefonoTrabajador, 
     String correoTrabajador, 
     String universidadProcedencia, 
     String fechaInicio, 
     String fechaTermino, 
     String horarioAsignadoPasante, 
     String turnoTrabajador, 
     String jornadaTrabajador, 
     int matriculaPasante, 
     String tipoTrabajador, 
     String especialidad, 
     int horasRegistradas,  
     String areaAsignada, 
     String observaciones, 
     String statusTrabajador, 
     String claseTrabajador ) {
        super(idTrabajador, nombreTrabajador, apPatTrabajador,apMatTrabajador ,calleTrabajador ,noIntTrabajador , 
               noExtTrabajador, estadoTrabajador,municipioTrabajador,telefonoTrabajador, correoTrabajador,universidadProcedencia,
              fechaInicio,fechaTermino,horarioAsignadoPasante,turnoTrabajador,jornadaTrabajador,matriculaPasante,tipoTrabajador,
              especialidad,horasRegistradas,areaAsignada,observaciones,statusTrabajador,claseTrabajador );
    }
    
    
     public  boolean agregar(){
        System.out.println("Inicio de agregado");
        boolean res= false;
        con = Conex.getInstance().getConnection();

        String cadSql= "call ins_Trabajador("+
           "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try {
           CallableStatement pstm = con.prepareCall(cadSql);
           pstm.setString(1,super.getNombreTrabajador());
           pstm.setString(2, super.getApPatTrabajador());
           pstm.setString(3, super.getApMatTrabajador());
           pstm.setString(4, super.getCalleTrabajador());
           pstm.setString(5, super.getNoIntTrabajador());
           pstm.setString(6, super.getNoExtTrabajador());
           pstm.setString(7, super.getEstadoTrabajador());
           pstm.setString(8, super.getMunicipioTrabajador());
           pstm.setString(9, super.getTelefonoTrabajador());
           pstm.setString(10, super.getCorreoTrabajador());
           pstm.setString(11, super.getUniversidadProcedencia());
           pstm.setString(12, super.getFechaInicio());
           pstm.setString(13, super.getFechaTermino());
           pstm.setString(14, super.getHorarioAsignadoPasante());
           pstm.setString(15, super.getTurnoTrabajador());
           pstm.setString(16, super.getJornadaTrabajador());
           pstm.setInt(17, super.getMatriculaPasante());
           pstm.setString(18,super. getTipoTrabajador());
           pstm.setString(19, super.getEspecialidad()); 
           pstm.setInt(20, super.getHorasRegistradas()); 
           pstm.setString(21, super.getAreaAsignada()); 
           pstm.setString(22, super.getObservaciones()); 
           pstm.setString(23, super.getClaseTrabajador()); 
          
           System.out.println("Se mando a ejecutar");
           pstm.executeUpdate();
           System.out.println("Se agregó exitosamente");
           res = true;
       } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       }                  
        return res;
    }
    
//<editor-fold defaultstate="collapsed" desc="eliminar">
     public boolean eliminar() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call delete_Paciente (?)");
            pstm.setInt(1, super.getNoProgresivo());
            pstm.execute();
            res = true;
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       }  
        return res;
    }
//</editor-fold>
     
    public boolean modificar() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call mod_Trabajador("
                    + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           pstm.setString(1,super.getNombreTrabajador());
           pstm.setString(2, super.getApPatTrabajador());
           pstm.setString(3, super.getApMatTrabajador());
           pstm.setString(4, super.getCalleTrabajador());
           pstm.setString(5, super.getNoIntTrabajador());
           pstm.setString(6, super.getNoExtTrabajador());
           pstm.setString(7, super.getEstadoTrabajador());
           pstm.setString(8, super.getMunicipioTrabajador());
           pstm.setString(9, super.getTelefonoTrabajador());
           pstm.setString(10, super.getCorreoTrabajador());
           pstm.setString(11, super.getUniversidadProcedencia());
           pstm.setString(12, super.getFechaInicio());
           pstm.setString(13, super.getFechaTermino());
           pstm.setString(14, super.getHorarioAsignadoPasante());
           pstm.setString(15, super.getTurnoTrabajador());
           pstm.setString(16, super.getJornadaTrabajador());
           pstm.setInt(17, super.getMatriculaPasante());
           pstm.setString(18,super. getTipoTrabajador());
           pstm.setString(19, super.getEspecialidad()); 
           pstm.setInt(20, super.getHorasRegistradas()); 
           pstm.setString(21, super.getAreaAsignada()); 
           pstm.setString(22, super.getObservaciones()); 
           pstm.setString(23, super.getClaseTrabajador()); 
            pstm.execute();

            res = true;
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    }
    
    public boolean activar() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call Activar_Paciente("
                    + " ?)");
           pstm.setInt(1,super.getNoExpediente());
           pstm.execute();
            res = true;
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    }
    
    public boolean activarEliminados() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call activate_error_paciente("
                    + " ?)");
           pstm.setInt(1,super.getIdPaciente());
           pstm.execute();
            res = true;
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    }
    public boolean del_trabajador() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call del_trabajador("
                    + " ?)");
           pstm.setInt(1,super.getIdTrabajador());
           pstm.execute();
            res = true;
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    } 
    
    public boolean del_detalleTrabajador() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call del_detalleTrabajador("
                    + " ?,?)");
           pstm.setInt(1,super.getIdPaciente());
           pstm.setInt(2,super.getIdTrabajador());
           pstm.execute();
            res = true;
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    }
    
    public boolean buscar() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call search_Trabajador(?)");
            stm.setInt(1, super.getIdTrabajador());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {   
           super.setNombreTrabajador(rs.getString(""));
           super.setApPatTrabajador(rs.getString(""));
           super.setApMatTrabajador(rs.getString(""));
           super.setCalleTrabajador(rs.getString(""));
           super.setNoIntTrabajador(rs.getString(""));
           super.setNoExtTrabajador(rs.getString(""));
           super.setEstadoTrabajador(rs.getString(""));
           super.setMunicipioTrabajador(rs.getString(""));
           super.setTelefonoTrabajador(rs.getString(""));
           super.setCorreoTrabajador(rs.getString(""));
           super.setUniversidadProcedencia(rs.getString(""));
           super.setFechaInicio(rs.getString(""));
           super.setFechaTermino(rs.getString(""));
           super.setHorarioAsignadoPasante(rs.getString(""));
           super.setTurnoTrabajador(rs.getString(""));
           super.setJornadaTrabajador(rs.getString(""));
           super.setMatriculaPasante(rs.getInt(""));
           super.setTipoTrabajador(rs.getString(""));
           super.setEspecialidad(rs.getString("")); 
           super.setHorasRegistradas(rs.getInt("")); 
           super.setAreaAsignada(rs.getString("")); 
           super.setObservaciones(rs.getString("")); 
           super.setClaseTrabajador(rs.getString("")); 
                
                
                
                
                res = true;
            }
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    }
    public boolean buscarEliminados() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call search_trabajdores_eliminados(?)");
            stm.setInt(1, super.getIdTrabajador());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {  
                super.setIdTrabajador(rs.getInt("IDPaciente"));
                super.setNombre(rs.getString("Nombre"));
                super.setApPat(rs.getString("ApPat"));
                super.setApMat(rs.getString( "ApMat"));
                res = true;
            }
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    }
    public boolean buscarActivacion() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call buscar_activacion(?)");
            stm.setInt(1, super.getNoExpediente());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {  
                super.setEstado(rs.getString("estado").charAt(0));
                res = true;
            }
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    }
    
    
    public DefaultTableModel listar() {
        DefaultTableModel tmodel = new DefaultTableModel();
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call list_CompletoTrabajadores()");
            ResultSet rs = stm.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            String nombreCol;
            for (int i = 1; i <= numCols; i++) {
                nombreCol = rsmd.getColumnName(i);
                nombreCol = nombreCol.toUpperCase();
                tmodel.addColumn(nombreCol);
            }
            String renglon[] = new String[numCols];
            while (rs.next()) {
                for (int c = 1, j = 0; c <= numCols; c++, j++) {
                    renglon[j] = rs.getString(c);
                }
                tmodel.addRow(renglon);
            }
         } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return tmodel;
    }
 
}
