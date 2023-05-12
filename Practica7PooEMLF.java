
package com.mycompany.practica7pooemlf;


public class Practica7PooEMLF {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto();
        auto1.modelo = "Mercedes Benz";
        auto1.color = "Negro";
        auto1.tipo = "Manual";
        auto1.placa = "TBA2033";
        auto1.motor = "A gasolina";
        
        Auto auto2 = new Auto();
        auto2.modelo = "Daewoo";
        auto2.color = "Blanco Hueso";
        auto2.tipo = "Automatico";
        auto2.placa = "JGT1229";
        auto2.motor = "A Gas";
        
        System.out.println(auto1.modelo);
        System.out.println(auto1.color);
        System.out.println(auto1.tipo);
        System.out.println(auto1.placa);
        System.out.println(auto1.motor);
        
        System.out.println(auto2.modelo);
        System.out.println(auto2.color);
        System.out.println(auto2.tipo);
        System.out.println(auto2.placa);
        System.out.println(auto2.motor);
        
        Ave ave1 = new Ave();
        ave1.raza = "Condor";
        ave1.tamaño = 130;
        ave1.habitat = "Montañas";
        ave1.color = "Blanco con Negro";
        ave1.genero = "Macho";
        
        Ave ave2 = new Ave();
        ave2.raza = "Gavilan";
        ave2.tamaño = 41;
        ave2.habitat = "Bosques";
        ave2.color = "Cafe con Amarillo";
        ave2.genero = "Hembra";
        
        System.out.println(ave1.raza);
        System.out.println(ave1.tamaño);
        System.out.println(ave1.habitat);
        System.out.println(ave1.color);
        System.out.println(ave1.genero);
        
        System.out.println(ave2.raza);
        System.out.println(ave2.tamaño);
        System.out.println(ave2.habitat);
        System.out.println(ave2.color);
        System.out.println(ave2.genero);
        
        Avion avion1 = new Avion();
        avion1.modelo = "Boeing 737 Max 8";
        avion1.color = "Blanco";
        avion1.motor = "LEAP-1B de CFM Internacional";
        avion1.ruta = "6570KM";
        avion1.capacidad = 210;
        
        Avion avion2 = new Avion();
        avion2.modelo = "Maveric";
        avion2.color = "Blanco con rayas azules";
        avion2.motor = "LEAP-1B";
        avion2.ruta = "7670KM";
        avion2.capacidad = 2;
        
        System.out.println(avion2.modelo);
        System.out.println(avion2.color);
        System.out.println(avion2.motor);
        System.out.println(avion2.ruta);
        System.out.println(avion2.capacidad);
        
        System.out.println(avion1.modelo);
        System.out.println(avion1.color);
        System.out.println(avion1.motor);
        System.out.println(avion1.ruta);
        System.out.println(avion1.capacidad);
        
    }
}
