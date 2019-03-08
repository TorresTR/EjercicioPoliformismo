package com.udec.ejerciciopoliformismo;

/**
 * Esta Clase es hoja de vehiculo pero a su vez es padre de Carro y jet
 * @author David
 */
abstract class VehiculoPotenciado extends Vehiculo{
    
    /**
     * Asigna un valor para el tipo de combustible
     */
    protected String tipoCombustible;

    /**
     * Contructor para asignar el valor para el vehiculo potenciado
     * @param marca
     * @param modelo
     * @param tipoCombustible 
     */
    public VehiculoPotenciado(String marca, String modelo, String tipoCombustible) {
        super(marca, modelo);
        this.tipoCombustible=tipoCombustible;
    }

    /**
     * Retorna la informacion para el tipo de combustible
     * @return tipoCombustible
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * Asigna un valor para el tipo de combustible
     * @param tipoCombustible 
     */
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    /**
     * metodo que relaiza un impresion de vehiculo potenciado
     */
    public void impresionVehiculoPotenciado(){
    
        System.out.println("\nsoy una hija de vehiculo pero a la vez padre de carro y jet");
    }
}
