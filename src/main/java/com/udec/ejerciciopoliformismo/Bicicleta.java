/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopoliformismo;

/**
 *
 * @author David
 */
public class Bicicleta extends Vehiculo{

    /**
     * captura el numero de cambios 
     */
    private int numeroCambios;
    
    /**
     * Constructor que guarda los datos de para las bicicletas
     * @param marca = guarda la marca de la cicla
     * @param modelo = guarda el modelo de la cicla 
     * @param numeroCambios = guarda el numero de cmabios de la cicila 
     */
    public Bicicleta(String marca, String modelo, int numeroCambios) {
        super(marca, modelo);
        this.numeroCambios = numeroCambios;
    }

    /**
     * Retorna el numero de cmabios de la cicla
     * @return numeroCambios
     */
    public int getNumeroCambios() {
        return numeroCambios;
    }

    /**
     * Asigna el numero de cmabios a la bicicleta
     * @param numeroCambios 
     */
    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

   
    public void imprimirBicicleta() {
        System.out.println("\n Soy Bicicletas y mi modelo es: "+modelo+"\ny mi marca es: "+marca+"\n y mi numero de cambios es:"+numeroCambios);
   }
    
    
}
