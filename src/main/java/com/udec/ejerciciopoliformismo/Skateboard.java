package com.udec.ejerciciopoliformismo;

/**
 * Esta clase se encarga de los datos de las skateboard
 * @author David
 */
public class Skateboard extends Vehiculo{
    
    /**
     * Captura el largo del skateboard
     */
    private double largoSkateboard;

    /**
     * inicializa los datos del skate board
     * @param marca = guarda la marca de la skateboard
     * @param modelo = guarda el modelo de la skateboard
     * @param largoSkateboard = guarda el largo de la skate board
     */
    public Skateboard(String marca, String modelo,double largoSkateboard) {
        super(marca, modelo);
        this.largoSkateboard=largoSkateboard;
    }

    
    /**
     * Retorna el largo del skateboard
     * @return largoSkateboard
     */
    public double getLargoSkateboard() {
        return largoSkateboard;
    }

    /**
     * Asignar un valor para el largo del skateboard
     * @param largoSkateboard 
     */
    public void setLargoSkateboard(double largoSkateboard) {
        this.largoSkateboard = largoSkateboard;
    }

    
    
    public void imprimirSkate() {
        System.out.println("\n Soy skateboard y mi modelo es: "+modelo+"\n mi marca es: "+marca+"\n y mi tamño de skate es: "+largoSkateboard);
    }
    
    
}
