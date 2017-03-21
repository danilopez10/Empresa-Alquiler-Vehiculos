/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
 * Clase que representa una furgoneta. Esta clase hereda de VehiculoCarga.
 * See vehiculoCarga
 * @author Daniel López Avilés
 */
public class Furgoneta extends VehiculoCarga{
    /**
     * Metodo por parametros de la clase
     * @param carga_maxima carga de la furgoneta
     * @param vehiculo matricula del vehiculo
     * @param alquiler dias a alquilar
     */
    public Furgoneta(int carga_maxima, String vehiculo, int alquiler) {
        super(carga_maxima, vehiculo, alquiler);
    }
    /**
     * Metodo por defecto de la clase.Llama al constructor por defecto de la clase padre
     */
    public Furgoneta() {
        super();
    }
    
    /**
     * Método recibo, que imprime los datos de la furgoneta
     */
    public void Recibo()
    {
        System.out.println("--------------------\n" +"FURGONETA\n" +"--------------------\n" +"información");
        super.recibo();
    }
    /**
     * Método alquiler, que devuleve cantidad, que es el importe por el alquiler de la furgoneta.
     * @return cantidad cantidad del alquiler del vehiculo
     */
    @Override
    public double alquiler() {
        double cantidad=(50*super.getAlquiler())+(20*super.getCarga_maxima());
        return cantidad;
    }
    /**
     * Metodo importealquiler.
     * @return excepcion
     */
    @Override
    public double importeAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
