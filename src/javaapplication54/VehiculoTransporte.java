/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
 * Clase que representa a un vehiculoTransporte
 * Hereda de vehiculo
 * See vehiculo
 * @author Daniel López Avilés
 */
public abstract class VehiculoTransporte extends Vehiculo{
    //Plazas utilizadas del vehiculo
    private int plazas;

    /**
     * Constructor por parametros de la clase
     * Llama al constructor por parametros de la clase padre
     * @param plazas plazas utilizadas del vehiculo
     * @param vehiculo matricula del vehiculo
     * @param alquiler dias a alquilar
     */
    public VehiculoTransporte(int plazas, String vehiculo, int alquiler) {
        super(vehiculo, alquiler);
        this.plazas = plazas;
    }  
    
    /**
     * Constructor por defecto de la clase
     * Llama al constructor por defecto de la clase padre
     */
    public VehiculoTransporte()
    {
        super();
        this.plazas=0;
    }

    /**
     * Observador de plazas, devolvera el numero de plazas utilizadas del vehiculo.
     * @return plazas plazas utilizadas del vehiculo
     */
    public int getPlazas() {
        return plazas;
    }
    /**
     * Método para cambiar el contenido de plazas.
     * @param plazas plazas utilizadas del vehiculo
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    /**
     * Método importeAlquiler, que devolvera el importe del alquiler del vehiculo
     * @return cantidad importe del alquiler del vehiculo
     */
    @Override
    public abstract double importeAlquiler();
    /**
     * Método recibo, que imprime toda la información del vehiculo.
     */
    @Override
    public void recibo()
    {
        System.out.println("Matricula: "+super.getMatricula());
        System.out.println("Duración: "+super.getAlquiler());
        System.out.println("Plazas: "+this.plazas);
        System.out.println("Importe: "+this.importeAlquiler()+"€");
    }
    
    
    
    
}
