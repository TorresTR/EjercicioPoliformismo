package com.udec.ejerciciopoliformismo;

/**
 * Esta es la clase que guarda los datos de los carros
 * @author David
 */
public class Carro  extends VehiculoPotenciado{

    /**
     * variable que guarda el tamaño del motor 
     */
    private int tamanoMotor;
    
    /**
     * Constructor que guarda los datos de los carros
     * @param marca = guarda la marca del auto
     * @param modelo = guarda el modelo del auto
     * @param tipoCombustible = guarda el tipo de combustible 
     * @param tamanoMotor = guarda el tamaño  del motor 
     */
    public Carro(String marca, String modelo, String tipoCombustible,int tamanoMotor) {
        super(marca, modelo, tipoCombustible);
        this.tamanoMotor = tamanoMotor;
    }

    /**
     * retorna el valor del tamaño del motor
     * @return tamanoMotor
     */
    public int getTamanoMotor() {
        return tamanoMotor;
    }

    /**
     * asigna un valor para el tamaño del motor
     * @param tamanoMotor 
     */
    public void setTamanoMotor(int tamanoMotor) {
        this.tamanoMotor = tamanoMotor;
    }

    
    public void imprimirCarro() {
        System.out.println("\nSoy un carro de modelo: "+modelo+"\n y mi marca es: "+marca+"\n mi tipo de combistible es:"
        + tipoCombustible+"\n mi tamaño del motor es: "+ tamanoMotor);
    }
    
    
}