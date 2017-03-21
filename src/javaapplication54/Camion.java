/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
 * Clase que representa a un camion
 * Esta clase hereda de VehiculoCarga
 * See VehiculoCarga
 * @author Daniel López Avilés
 */
public class Camion extends VehiculoCarga{
    /**
     * Constructor por defecto de la clase
     * Llama al constructor por defecto de la clase padre
     */
    public Camion()
    {
        super();
    }
    /**
     * Constructor por parametros de la clase
     * @param carga_maxima carga del camion
     * @param vehiculo matricula del camion
     * @param alquiler dias a alquilar
     */
    public Camion(int carga_maxima, String vehiculo, int alquiler) {
        super(carga_maxima, vehiculo, alquiler);
    }
    
    
    
    /**
     * Metodo alquiler, que devuelve cantidad, que es el conste del alquiler
     * @return cantidad
     */
    @Override
    public double alquiler() {
         double cantidad=(50*super.getAlquiler())+(20*super.getCarga_maxima())+40;
         return cantidad;
    }
    /**
     * Metodo importeAlquiler
     * @return excepcion
     */
    @Override
    public double importeAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
