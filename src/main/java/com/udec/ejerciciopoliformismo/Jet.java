package com.udec.ejerciciopoliformismo;

/**
 * Esta clase guarda los datos del jet
 * @author David
 */
public class Jet extends VehiculoPotenciado{
    
    /**
     * guarda el valor del numero de turbinas
     */
    private int numeroTurbinas;

    /**
     * Contructor de los datos para inicializar los datos del jet
     * @param marca = guarda la marca del jet
     * @param modelo = guarda el modelo del jet
     * @param tipoCombustible = guarda el tipo de combustible
     * @param numeroTurbinas = guarda el numero de turbinas
     */
    public Jet(String marca, String modelo, String tipoCombustible,int numeroTurbinas) {
        super(marca, modelo, tipoCombustible);
        this.numeroTurbinas=numeroTurbinas;
    }

    /**
     * Retorna el valor del numero de turbinas
     * @return numeroTurbinas
     */
    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    /**
     * Asigna un valor para el numero de turbinas
     * @param numeroTurbinas 
     */
    public void setNumeroTurbinas(int numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }

    
    
    /**
     * metodo Encender especializado de la interfaz
     */
    @Override
    public void encender(){
        System.out.println("\n-----EL Jet se encendio y esta a su maxima potencia-----");
    }
    
    /**
     * metodo apagar especializado de la interfaz
     */
    @Override
    public void apagar(){
        System.out.println("\n------EL Jet se apago sus turbinas------");
    }
    
    /**
     * metodo que imprime los datos de los Jets
     */
    public void imprimirJet() {
        System.out.println("\n Soy un jet de tipo:"+
                marca+"\n mi modelo es:"+modelo+"\n mi tipo de combustible: "+tipoCombustible + "\n mi numero de turbinas es: "
        + numeroTurbinas);
    }
    
    
}
