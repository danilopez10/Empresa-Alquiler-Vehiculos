/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
 * Clase que representa a un coche
 * Esta clase hereda de VehiculoTransporte
 * See VehiculoTransporte
 * @author Daniel López Avilés
 */
public class Coche extends VehiculoTransporte{
    /**
     * Metodo por parametros de la clase
     * @param plazas plazas utilizadas del coche
     * @param vehiculo matricula del vehiculo
     * @param alquiler dias a alquilar
     */
    public Coche(int plazas, String vehiculo, int alquiler) {
        super(plazas, vehiculo, alquiler);
    }
    /**
     * Metodo por defecto de la clase.
     * Llama al constructor por defecto de la clase padre.
     */
    public Coche() {
        super();
    }
    
    /**
     * Metodo recibo, imprime la informacion del coche
     */
    @Override
    public void recibo ()
    {
        System.out.println("---------------");
        System.out.println("COCHE");
        System.out.println("---------------");
        System.out.println("Información");
        super.recibo();
    }
    /**
     * Metodo importeAlquiler, devuelve cantidad, que es la cantidad del alquiler del coche
     * @return cantidad
     */
    @Override
    public double importeAlquiler() {
        double cantidad =(50*super.getAlquiler())+(1.5*super.getPlazas());
        return cantidad;
    }

}
