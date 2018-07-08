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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JP
 */
public class DAOTrabajadores extends Trabajadores {
    private String mensaje;
    Connection con; 
    
    Pacientes d = new Pacientes();

    public DAOTrabajadores() {
    }

    public DAOTrabajadores(int idTrabajador, String nombreTrabajador, String apPatTrabajador, String apMatTrabajador, String calleTrabajador, String noIntTrabajador, String noExtTrabajador, String estadoTrabajador, String municipioTrabajador, String telefonoTrabajador, String correoTrabajador, String universidadProcedencia, String fechaInicio, String fechaTermino, String horarioAsignadoPasante, String turnoTrabajador, String jornadaTrabajador, int matriculaPasante, String tipoTrabajador, String especialidad, int horasRegistradas, String areaAsignada, String observaciones, String statusTrabajador, String claseTrabajador) {
        super(idTrabajador, nombreTrabajador, apPatTrabajador, apMatTrabajador, calleTrabajador, noIntTrabajador, noExtTrabajador, estadoTrabajador, municipioTrabajador, telefonoTrabajador, correoTrabajador, universidadProcedencia, fechaInicio, fechaTermino, horarioAsignadoPasante, turnoTrabajador, jornadaTrabajador, matriculaPasante, tipoTrabajador, especialidad, horasRegistradas, areaAsignada, observaciones, statusTrabajador, claseTrabajador);
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
           pstm.setString(23, ""+super.getClaseTrabajador()); 
          
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
     
     public  boolean agregarDetalleTrabajador(){
        System.out.println("Inicio de agregado");
        boolean res= false;
        con = Conex.getInstance().getConnection();

        String cadSql= "call ins_DetalleTrabajador("+
           "?,?)";
       try { 
           CallableStatement pstm = con.prepareCall(cadSql);
           pstm.setInt(1,d.getIdPaciente());
           pstm.setInt(2,super.getIdTrabajador());
          
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
    
//</editor-fold>
    public boolean activar() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call activar_trabajador("
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
           pstm.setString(23, ""+super.getClaseTrabajador()); 
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
           pstm.setInt(1,d.getIdPaciente());
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
           super.setNombreTrabajador(rs.getString("nombreTrabajador"));
           super.setApPatTrabajador(rs.getString("apPatTrabajador"));
           super.setApMatTrabajador(rs.getString("apMatTrabajador"));
           super.setCalleTrabajador(rs.getString("calleTrabajador"));
           super.setNoIntTrabajador(rs.getString("noIntTrabajador"));
           super.setNoExtTrabajador(rs.getString("noExtTrabajador"));
           super.setEstadoTrabajador(rs.getString("estadoTrabajador"));
           super.setMunicipioTrabajador(rs.getString("municipioTrabajador"));
           super.setTelefonoTrabajador(rs.getString("telefonoTrabajador"));
           super.setCorreoTrabajador(rs.getString("correoTrabajador"));
           super.setUniversidadProcedencia(rs.getString("universidadProcedencia"));
           super.setFechaInicio(rs.getString("fechaInicio"));
           super.setFechaTermino(rs.getString("fechaTermino"));
           super.setHorarioAsignadoPasante(rs.getString("horarioAsignadoPasante"));
           super.setTurnoTrabajador(rs.getString("turnoTrabajador"));
           super.setJornadaTrabajador(rs.getString("jornadaTrabajador"));
           super.setMatriculaPasante(rs.getInt("matriculaPasante"));
           super.setTipoTrabajador(rs.getString("tipoTrabajador"));
           super.setEspecialidad(rs.getString("Especialidad")); 
           super.setHorasRegistradas(rs.getInt("horasRegistradas")); 
           super.setAreaAsignada(rs.getString("areaAsignada")); 
           super.setObservaciones(rs.getString("observaciones")); 
           super.setClaseTrabajador(rs.getString("claseTrabajador")); 
                
                
                
                
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
                super.setIdTrabajador(rs.getInt("idTrabajador"));
                super.setNombreTrabajador(rs.getString("nombreTrabajador"));
                super.setApPatTrabajador(rs.getString("apPatTrabajador"));
                super.setApMatTrabajador(rs.getString( "apMatTrabajador"));
                res = true;
            }
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    } 
    
    public DefaultTableModel listarPasantes() {
        DefaultTableModel tmodel = new DefaultTableModel();
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call list_Pasantes()");
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
    
    
    public DefaultTableModel listarPersonal() {
        DefaultTableModel tmodel = new DefaultTableModel();
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call list_Personal()");
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
    
    
    public DefaultTableModel listarTrabajaddor() {
        DefaultTableModel tmodel = new DefaultTableModel();
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call list_PorTrabajador()");
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
    
    public ArrayList<ComboItem> filtrarTrabajadores(String filtro){
        ArrayList<ComboItem> trabajadores = new ArrayList<>();
        con = Conex.getInstance().getConnection();
        String nombre="";
        int id= 0;
        try {
            CallableStatement cstm = con.prepareCall("CALL filtrar_Trabajadores(?)");
            cstm.setString(1, filtro);
            ResultSet rs = cstm.executeQuery();
            while(rs.next()){
                id = rs.getInt("idTrabajador");
                nombre = rs.getString("Nombre_Completo");
                trabajadores.add(new ComboItem(id,nombre));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trabajadores;
    }
    //</editor-fold>
    public ArrayList<ComboItem> filtrarTrabajadoresEliminados(String filtro){
        ArrayList<ComboItem> trabajadores = new ArrayList<>();
        con = Conex.getInstance().getConnection();
        String nombre="";
        int id= 0;
        try {
            CallableStatement cstm = con.prepareCall("CALL filtrar_Trabajadores_eliminados(?)");
            cstm.setString(1, filtro);
            ResultSet rs = cstm.executeQuery();
            while(rs.next()){
                id = rs.getInt("idTrabajador");
                nombre = rs.getString("Nombre_Completo");
                trabajadores.add(new ComboItem(id,nombre));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trabajadores;
    }
}
 
