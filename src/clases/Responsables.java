/*
 * Titulo: Modulo paciente.
 * Este programa se realizó para la organización "La sagrada familia A.C".
 * Clase de los constructores, getters y setters(de los atributos) para el objeto Responsables.
 * @version 25/02/2017
 */
package clases;

/**
 * @author Pablo Alberto Rodirguez Lopez.
 * @author Tomas Alejandro Vargas Lopez.
 * @author Jose Luis Tinajero Carvajal.
 */
public class Responsables {
    private int idPaciente;
    private int idResponsable;
    private  char activo = '1';//si o no
    private String nombreResponsable;
    private String apPatResponsable;
    private String apMatResponsable;
    private String tel1,tel2,tel3;
    private String relacion;
    private String calle;
    private String noExt;
    private String noInt;
    private String colonia;
    private String cP;
    private String municipioResponsable;
    private String estadoResponsable;
    private int noProgresivo;

    public Responsables() {
    }

    public Responsables(int idPaciente, int idResponsable, String nombreResponsable, String apPatResponsable, String apMatResponsable, int noProgresivo, String tel1, String tel2, String tel3, String relacion, String calle, String noExt, String noInt, String colonia, String cP, String municipioResponsable, String estadoResponsable) {
        this.idPaciente = idPaciente;
        this.idResponsable = idResponsable;
        this.nombreResponsable = nombreResponsable;
        this.apPatResponsable = apPatResponsable;
        this.apMatResponsable = apMatResponsable;
        this.noProgresivo = noProgresivo;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.tel3 = tel3;
        this.relacion = relacion;
        this.calle = calle;
        this.noExt = noExt;
        this.noInt = noInt;
        this.colonia = colonia;
        this.cP = cP;
        this.municipioResponsable = municipioResponsable;
        this.estadoResponsable = estadoResponsable;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public char getActivo() {
        return activo;
    }

    public void setActivo(char activo) {
        this.activo = activo;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApPatResponsable() {
        return apPatResponsable;
    }

    public void setApPatResponsable(String apPatResponsable) {
        this.apPatResponsable = apPatResponsable;
    }

    public String getApMatResponsable() {
        return apMatResponsable;
    }

    public void setApMatResponsable(String apMatResponsable) {
        this.apMatResponsable = apMatResponsable;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoExt() {
        return noExt;
    }

    public void setNoExt(String noExt) {
        this.noExt = noExt;
    }

    public String getNoInt() {
        return noInt;
    }

    public void setNoInt(String noInt) {
        this.noInt = noInt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getcP() {
        return cP;
    }

    public void setcP(String cP) {
        this.cP = cP;
    }

    public String getMunicipioResponsable() {
        return municipioResponsable;
    }

    public void setMunicipioResponsable(String municipioResponsable) {
        this.municipioResponsable = municipioResponsable;
    }

    public String getEstadoResponsable() {
        return estadoResponsable;
    }

    public void setEstadoResponsable(String estadoResponsable) {
        this.estadoResponsable = estadoResponsable;
    }

    public int getNoProgresivo() {
        return noProgresivo;
    }

    public void setNoProgresivo(int noProgresivo) {
        this.noProgresivo = noProgresivo;
    }
    
}
