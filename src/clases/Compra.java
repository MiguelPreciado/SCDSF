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
public class Compra {
    public int idCompra; 
    private String farmacia;
    private String numFactura;
    private String sucursal;  
    private double costo;
    private String nombreProductoPat;
    private String nombreProductoGen;
    private String tipoAdministracion;
    
    
    
    public Compra() {
    }

    public Compra(int idCompra, String farmacia, String numFactura, double costo) {
        this.idCompra = idCompra;
        this.farmacia = farmacia;
        this.numFactura = numFactura;
        this.costo = costo;
    }

    public Compra(String farmacia, String numFactura, String sucursal, double costo, String nombreProductoPat, String nombreProductoGen, String tipoAdministracion) {
        this.farmacia = farmacia;
        this.numFactura = numFactura;
        this.sucursal = sucursal;
        this.costo = costo;
        this.nombreProductoPat = nombreProductoPat;
        this.nombreProductoGen = nombreProductoGen;
        this.tipoAdministracion = tipoAdministracion;
    }

    
    
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(String farmacia) {
        this.farmacia = farmacia;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombreProductoPat() {
        return nombreProductoPat;
    }

    public void setNombreProductoPat(String nombreProductoPat) {
        this.nombreProductoPat = nombreProductoPat;
    }

    public String getNombreProductoGen() {
        return nombreProductoGen;
    }

    public void setNombreProductoGen(String nombreProductoGen) {
        this.nombreProductoGen = nombreProductoGen;
    }

    public String getTipoAdministracion() {
        return tipoAdministracion;
    }

    public void setTipoAdministracion(String tipoAdministracion) {
        this.tipoAdministracion = tipoAdministracion;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
    
}
