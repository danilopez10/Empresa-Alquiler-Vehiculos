/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.util.Scanner;

/**
 *
 * @author Daniel López Avilés
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime cuantos vehiculos quieres alquilar");
        Alquiler nuevo=new Alquiler(teclado.nextInt());
        nuevo.mostrarDatos();
        System.out.println("Dime el vehiculo que deseas ver su importe");
        nuevo.importe(teclado.nextInt());
        
    }
    
}
