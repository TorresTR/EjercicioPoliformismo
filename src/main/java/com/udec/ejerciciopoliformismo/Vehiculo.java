package com.udec.ejerciciopoliformismo;

import interfaz.IVehiculo;

/**
 * Esta es la clase padre de vehiculos
 * @author David
 */
  public abstract class Vehiculo implements IVehiculo{
    
    /**
     * guarda el dato de la marca del vehiculo
     */
    protected String marca;
    
    /**
     * guarda el modelo del vehiculo
     */
    protected String modelo;

    /**
     * Contructor para guardar los datos de lo vehiculos
     * @param marca
     * @param modelo 
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Retorna la informacion de la marca del vehiculo
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Permite asignar el parametro para la marca
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Retorna la informacion del modelo
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Permite asignar la informacion para modelo
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void imprimir(){
        System.out.println("\nSoy el padre y estoy imprimiendo desde Vehiculo");
    }
    
    @Override
    public void encender(){
        System.out.println("Estoy encendido y estoy imprimiendo desde la clase Vehiculo");
    }
    
    @Override
    public void apagar(){
        System.out.println("Estoy apagado y estoy imprimiendo desde la clase Vehiculo");
    }
}
