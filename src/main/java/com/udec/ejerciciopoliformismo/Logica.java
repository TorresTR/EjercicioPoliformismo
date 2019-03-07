package com.udec.ejerciciopoliformismo;

import java.util.ArrayList;
import java.util.List;

/**
 *Se guarda la logica del programa
 * @author David
 */

public class Logica {
    List<Vehiculo> veh = new ArrayList<Vehiculo>();

    public Logica() {
        insertar();
    }
    
    
    public void insertar(){
        Vehiculo skate = new Skateboard("tiger","LongBoard", 1.20);
        Vehiculo bicibleta = new Bicicletas("guepard", "todo terreno", 10);
        Vehiculo carro = new  Carro("ferrari", "gt320", "solo alta reactancia", 500);
        Vehiculo jet = new Jet("F-22", "combate largo alcance", "combustible de alta potencia", 2);
    
        veh.add(skate);
        veh.add(bicibleta);
        veh.add(carro);
        veh.add(jet);
    
    
        for(Vehiculo vehiculo : veh){
            if(vehiculo instanceof Skateboard){
                Skateboard skat = (Skateboard) vehiculo;
                skat.imprimir();
                skat.imprimirSkate();     
            }else if(vehiculo instanceof Bicicletas){
                Bicicletas bici= (Bicicletas) vehiculo;
                bici.imprimir();
                bici.imprimirBicicleta();
            }else if(vehiculo instanceof Carro){
                Carro car = (Carro) vehiculo;
                car.imprimir();
                car.impresionVehiculoPotenciado();
                car.imprimirCarro();
            }else if(vehiculo instanceof Jet){
                Jet avion = (Jet)vehiculo;
                avion.imprimir();
                avion.impresionVehiculoPotenciado();
                avion.imprimirJet();
            }
        }
    
    }
 
}

