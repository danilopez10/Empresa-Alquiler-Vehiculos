/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
 * Clase que representa a un vehiculo
 * @author Daniel López Avilés
 */
public abstract class Vehiculo {
    //Matricula del vehiculo
    private String matricula;
    //Dias a alquilar
    private int alquiler;
    
    /**
     * Constructor por parametros de la clase
     * @param vehiculo matricula del vehiculo
     * @param alquiler dias a alquilar
     */
    public Vehiculo(String vehiculo, int alquiler) {
        this.matricula = vehiculo;
        this.alquiler = alquiler;
    }
    
    /**
     * Constructor por defecto de la clase
     */
    public Vehiculo()
    {
        this.alquiler=0;
        this.matricula="Vacio";
    }
    
    /**
     * Observador para devolver la matricula
     * @return matricula
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * Método para cambiar el contenido de la matricula
     * @param vehiculo matricula del vehiculo
     */
    public void setMatricula(String vehiculo) {
        this.matricula = vehiculo;
    }
    
    /**
     * Observador de alquiler, dias a alquilar
     * @return alquiler
     */
    public int getAlquiler() {
        return alquiler;
    }
    
    /**
     * Método para cambiar el contenido del alquiler.
     * @param alquiler dias a alquilar el vehiculo
     */
    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }
    /**
     * Método importeAlquiler, que devolvera el importe del alquiler del vehiculo
     * @return cantidad
     */
    public abstract double importeAlquiler();
    
    /**
     * Método recibo, que devolvera toda la información de la clase.
     */
    public abstract void recibo();
    
}
