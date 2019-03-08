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

    /**
     * metodo especializado en la clase carro, que trae de la clase Vehiculos
     */
    @Override
     public void imprimir(){
        System.out.println("\n-----------Carro------------------");
        System.out.println("\nSoy el padre Vehiculo imprimiendo desde la clase Carro");
    }
    
    /**
     * metodo especializado en la clase carro que trae de VehiculoPotenciado
     */
    @Override
    public void impresionVehiculoPotenciado(){
    
        System.out.println("\nSoy VehiculoPotenciado y estoy imprimiendo desde la calse carro");
    }
   
    /**
     * metodo Encender especializado de la interfaz
     */
    @Override
    public void encender(){
        System.out.println("EL carro se prendio");
    }
    
    /**
     * metodo apagar especializado de la interfaz
     */
    @Override
    public void apagar(){
        System.out.println("EL carro se apago");
    }
    
    /**
     * metodo que imprime los datos de los vehiculos
     */
    public void imprimirCarro() {
        System.out.println("\nSoy un carro de modelo: "+modelo+"\n y mi marca es: "+marca+"\n mi tipo de combistible es:"
        + tipoCombustible+"\n mi tamaño del motor es: "+ tamanoMotor);
    }
    
    
}
