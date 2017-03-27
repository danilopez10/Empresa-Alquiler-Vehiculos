/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication54;

import java.util.ArrayList;
import java.util.Scanner;

/**
* Clase que representa al alquiler de vehiculos 
* Esta clase implementa la clase Datos
* @author Daniel López Avilés
* @see Datos
 */
public final class Alquiler implements Datos{
    //Declaracion de los tipos de clases(vehiculos)
    private Furgoneta f;
    private Camion t;
    private Coche c;
    private Bus b;
    
    //Creamos el array para guardar los vehiculos
    private ArrayList<Vehiculo> pedido=new ArrayList<>();
    
    /**
     * Devuelve la informacion de todos los vehiculos alquilados
     */
    @Override
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Total alquiler: cantidad €\n"
                + "----------------------------------\n"
                + "DETALLE\n"
                + "---------------------------------\n");
        for (int i = 0; i < pedido.size(); i++) {
            System.out.println("Vehiculo "+(i));
            System.out.println("Informacion del vehiculo");
            pedido.get(i).recibo();
        }
        
        
        
    }
    /**
     * Crea todos los vehiculos a alquilar y guarda su información
     * @param vehiculos Numero de vehiculos a alquilar
     */
    public Alquiler(int vehiculos) {
        
        while(vehiculos!=0)
        {
            Scanner string =new Scanner(System.in);
            System.out.println("Introduce el tipo de vehiculo");
            String TipoVehiculo=string .nextLine();
            Scanner enteros=new Scanner(System.in);
            if(TipoVehiculo.charAt(0)=='c')
            {
                c=new Coche();
                System.out.println("Dime la matricula");
                c.setMatricula(string.nextLine());
                System.out.println("Dime los dias para alquilar");
                c.setAlquiler(enteros.nextInt());
                System.out.println("Dime las plazas");
                c.setPlazas(enteros.nextInt());
                pedido.add(c);
            }
            if(TipoVehiculo.charAt(0)=='b')
            {
                b=new Bus();
                System.out.println("Dime la matricula");
                b.setMatricula(string.nextLine());
                System.out.println("Dime los dias para alquilar");
                b.setAlquiler(enteros.nextInt());
                System.out.println("Dime las plazas");
                b.setPlazas(enteros.nextInt());
                pedido.add(b);
            }
            if(TipoVehiculo.charAt(0)=='f')
            {
                f=new Furgoneta();
                System.out.println("Dime la matricula");
                f.setMatricula(string.nextLine());
                System.out.println("Dimes los dias para alquilar");
                f.setAlquiler(enteros.nextInt());
                System.out.println("Dime el peso");
                f.setCarga_maxima(enteros.nextInt());
                pedido.add(f);
            }
            if(TipoVehiculo.charAt(0)=='t')
            {
                t=new Camion();
                System.out.println("Dime la matricula");
                t.setMatricula(string.nextLine());
                System.out.println("Dime los dias a alquilar");
                t.setAlquiler(enteros.nextInt());
                System.out.println("Introduce el peso");
                t.setCarga_maxima(enteros.nextInt());
                pedido.add(t);
            }
            vehiculos--;
        }
    }
    
    /**
     * Devuelve el importe total del alquiler de todos los vehiculos
     * @return Importe total del alquiler vehiculos
     */
    public double importeTotal()
    {
        double cantidad=0;
        for (int i = 0; i < pedido.size(); i++) {
            cantidad=cantidad+pedido.get(i).importeAlquiler();
        }
        return cantidad;
    }
    /**
     * Devuelve importe de un vehiculo
     * @param posicion Posición del vehiculo en el array
     * @return Precio del alquiler del vehiculo
     */
    public double importe(int posicion)
    {
        double cantidad=pedido.get(posicion-1).importeAlquiler();
        return cantidad;
    }
}
