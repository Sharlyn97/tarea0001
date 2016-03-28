/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Moon
 */
public class Curso {

    private String nombre;
    private String siglas;
    private int creditos;
    
    public Curso(String nombre, String siglas, int creditos)
    {
        this.nombre=nombre;
        this.siglas=siglas;
        this.creditos=creditos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the siglas
     */
    public String getSiglas() {
        return siglas;
    }

    /**
     * @param siglas the siglas to set
     */
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
     
    public String getInformacion()
    {
        return "Siglas: "+siglas+" \nCurso: "+nombre+" \nCréditos: "+creditos;
    }
}
