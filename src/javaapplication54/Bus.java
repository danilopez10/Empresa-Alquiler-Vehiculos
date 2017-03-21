/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
* Clase que representa a un profesor.
* Esta clase hereda de VehiculoTransporte
* @author Daniel López Avilés
* @see VehiculoTransporte
 */
public class Bus extends VehiculoTransporte{
    /**
     * Constructor por parametros de la clase Bus
     * @param plazas Número de plazas del vehiculo
     * @param vehiculo Tipo de vehiculo
     * @param alquiler Dias a alquilar
     */
    public Bus(int plazas, String vehiculo, int alquiler) {
        super(plazas, vehiculo, alquiler);
    }
    /**
     * Constructor por defecto, llama al constructor por defecto de la clase padre.
     */
    public Bus() {
        super();
    }
    
    /**
     * Método recibo, para imprimir la información del bús.
     */
    @Override
    public void recibo()
    {
        System.out.println("----------------");
        System.out.println("BUS");
        System.out.println("----------------");
        System.out.println("Información");
        super.recibo();
    }
    /**
     * Método importeAlquiler, devuelve cantidad, que es el conste del alquiler del bus.
     * @return cantidad
     */
    @Override
    public double importeAlquiler() {
        double cantidad=(50*super.getAlquiler())+(1.5*super.getPlazas())+2*super.getPlazas();
        return cantidad;
    }
    
}
