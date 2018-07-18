/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class DaoCompra extends Compra {
    private String mensaje;
    Connection con;
    
    public DaoCompra() {
    }

    public DaoCompra(int idCompra, String farmacia, String numFactura, double costo) {
        super(idCompra, farmacia, numFactura, costo);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public boolean agregar() {
        
        boolean res = false;
        con = clases.Conex.getInstance().getConnection();
        
        
        String cadSql = "{call sp_com_ins (?,?,?,?)}";
        
        try {
            CallableStatement cstm = con.prepareCall(cadSql);
            cstm.setString(1, getFarmacia());
            cstm.setString(2, getNumFactura());
            cstm.setDouble(3, getCosto());
            cstm.setString(4, getSucursal());
//            cstm.setString(1, this.getNombreProductoPat());
//            cstm.setString(1, this.getNombreProductoGen());
//            cstm.setString(1, this.getTipoAdministracion());
            cstm.execute();
            res = true;
        } catch (SQLException ex) {
            mensaje = ex.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
         
        return res;
    }
    
}
