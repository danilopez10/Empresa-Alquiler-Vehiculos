/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

/**
 * Clase que representa a un vehiculo de carga. Hereda de vehiculo
 * See vehiculo
 * @author Daniel López Avilés
 */
public abstract class VehiculoCarga extends Vehiculo{
    //Carga del vehiculoCarga
    private int carga_maxima;

    /**
     * Constructor por parametros de la clase
     * LLama al constructor por parametros de la clase padre
     * @param carga_maxima carga del vehiculo
     * @param vehiculo matricula del vheiculo
     * @param alquiler dias a alquilar
     */
    public VehiculoCarga(int carga_maxima, String vehiculo, int alquiler) {
        super(vehiculo, alquiler);
        this.carga_maxima = carga_maxima;
    }

    /**
     * Constructor por defecto de la clase
     * Llama al constructor por defecto de la clase padre
     */
    public VehiculoCarga() {
        super();
        this.carga_maxima = 0;
    }

    /**
     * Observador de carga maxima
     * @return carga_maxima carga del vehiculo
     */
    public int getCarga_maxima() {
        return carga_maxima;
    }

    /**
     * Método para cambiar el contenido de carga maxima
     * @param carga_maxima carga del vehiculo
     */
    public void setCarga_maxima(int carga_maxima) {
        this.carga_maxima = carga_maxima;
    }
    
    /**
     * Metodo alquiler, que devolvera la cantidad del alquiler del vehiculo
     * @return cantidad
     */
    public abstract double alquiler();
    
    /**
     * Método recibo, que imprime toda la información del vehiculo
     */
    @Override
    public final void recibo()
    {
        System.out.println("Matricula: "+super.getMatricula());
        System.out.println("Duración: "+super.getAlquiler());
        System.out.println("Tara: "+this.getCarga_maxima());
        System.out.println("Importe: "+this.alquiler()+"€");
    }
    
    
    
}
