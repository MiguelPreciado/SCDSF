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
 * @author Wicho
 */
public class DAOSituaciones extends Situaciones{
    private String mensaje;
    Connection con; 

    public DAOSituaciones() {
    }

    public DAOSituaciones(int idSituacion, int idTrabajador, String horarioSituacion, String areaSituacion, String turnoSituacion, String tipoSituacion, String descripcionSituacion, String fechaSituacion) {
        super(idSituacion, idTrabajador, horarioSituacion, areaSituacion, turnoSituacion, tipoSituacion, descripcionSituacion, fechaSituacion);
    }
    
    public  boolean agregar(){
        System.out.println("Inicio de agregado");
        boolean res= false;
        con = Conex.getInstance().getConnection();

        String cadSql= "call ins_Situacion("+
           "?,?,?,?,?,?,?)";
       try {
           CallableStatement pstm = con.prepareCall(cadSql);
           pstm.setInt(1,super.getIdTrabajador());
           pstm.setString(2, super.getHorarioSituacion());
           pstm.setString(3, super.getAreaSituacion());
           pstm.setString(4, super.getTurnoSituacion());
           pstm.setString(5, super.getTipoSituacion());
           pstm.setString(6, super.getDescripcionSituacion());
           pstm.setString(7, super.getFechaSituacion());
           
          
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
    
    
    public boolean delSituacion() {
        boolean res = false;
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement pstm = con.prepareCall("call del_Situacion("
                    + " ?)"); 
           pstm.setInt(1,super.getIdSituacion());
           pstm.execute();
            res = true;
        } catch (SQLException ex) {
           mensaje = ex.getMessage();
           System.out.println(mensaje);
       } 
        return res;
    } 
    
    
    public DefaultTableModel listarSituaciones() {
        DefaultTableModel tmodel = new DefaultTableModel();
        con = Conex.getInstance().getConnection();
        try {
            CallableStatement stm = con.prepareCall("call list_Situaciones(?)");
            stm.setInt(1, super.getIdTrabajador());
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
    
    public void setSituaciones(Situaciones s){
        super.setIdTrabajador(s.getIdTrabajador());
        super.setAreaSituacion(s.getAreaSituacion());
        super.setDescripcionSituacion(s.getDescripcionSituacion());
        super.setFechaSituacion(s.getFechaSituacion());
        super.setHorarioSituacion(s.getHorarioSituacion());
        super.setIdSituacion(s.getIdSituacion());
        super.setTipoSituacion(s.getTipoSituacion());
        super.setTurnoSituacion(s.getTurnoSituacion());
    }
}
