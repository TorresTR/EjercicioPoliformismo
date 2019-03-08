package com.udec.ejerciciopoliformismo;

import java.util.ArrayList;
import java.util.List;

/**
 *Se guarda la logica del programa
 * @author David
 */

public class Logica {
    /**
     * Se crea una lista que contiene objetos de tipo vehiculo 
     */
    List<Vehiculo> veh = new ArrayList<Vehiculo>();

    /**
     * constructor donde se iniciara el programa
     */
    public Logica() {
        insertar();
    }
    
    
    /**
     * metodo donde se ejecuta todo el programa
     */
    public void insertar(){
        Vehiculo skate = new Skateboard("tiger","LongBoard", 1.20);
        Vehiculo bicibleta = new Bicicleta("guepard", "todo terreno", 10);
        Vehiculo carro = new  Carro("ferrari", "gt320", "solo alta reactancia", 500);
        Vehiculo jet = new Jet("F-22", "combate largo alcance", "combustible de alta potencia", 2);
        veh.add(skate);
        veh.add(bicibleta);
        veh.add(carro);
        veh.add(jet);
        imprimir();
    }
 
    /**
     * este metodo se encarga de la impresion de los datos
     */
    public void imprimir(){
        for(Vehiculo vehiculo : veh){
            if(vehiculo instanceof Skateboard){
                Skateboard skat = (Skateboard) vehiculo;
                skat.imprimirSeparador();
                skat.imprimir();
                skat.imprimirSkate();  
                skat.encender();
                skat.apagar();
            }else if(vehiculo instanceof Bicicleta){
                Bicicleta bici= (Bicicleta) vehiculo;
                bici.imprimirSeparador();
                bici.imprimir();
                bici.imprimirBicicleta();
                bici.encender();
                bici.apagar();
            }else if(vehiculo instanceof Carro){
                Carro car = (Carro) vehiculo;
                car.imprimir();
                car.impresionVehiculoPotenciado();
                car.imprimirCarro();
                car.encender();
                car.apagar();
            }else if(vehiculo instanceof Jet){
                Jet avion = (Jet)vehiculo;
                avion.imprimirJet();
                avion.imprimir();
                avion.impresionVehiculoPotenciado();
                avion.encender();
                avion.apagar();
            }
        }
    }
}


