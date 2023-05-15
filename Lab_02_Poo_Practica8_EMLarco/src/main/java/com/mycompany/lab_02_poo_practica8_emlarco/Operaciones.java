
package com.mycompany.lab_02_poo_practica8_emlarco;

import javax.swing.JOptionPane;

public class Operaciones {

    public void capturarnumeros(){
//Para pedir que ingrese los numeros en pantalla

    }
    //Para que retorne valores cambiamos void por int, string
    //Cambiams por int
    public int sumar(int num1, int num2){
        int suma = num1+num2;
        //retorna la suma
        return suma;
     }
    //Creamos un metodo para mostrar resultados 

    public int restar(int num1, int num2){
        int resta = num1-num2;
        //retorna la resta
        return resta;
    }
    public int multiplicacion(int num1,int num2){
        int multiplicar = num1*num2;
        //retorna la multiplicacion
        return multiplicar;
    }
    public int division(int num1, int num2){
        int dividir = num1/num2;
        //retorna la division
        return dividir;
    }
    public void resultados(int suma, int resta, int multiplicar, int dividir){
        System.out.println("El resultado de la suma es:"+suma);
        System.out.println("El resultado de la resta es:"+resta);
        System.out.println("El resultado de la multiplicacion es:"+multiplicar);
        System.out.println("El resultado de la division es:"+dividir);
        //sout
        //System.out.println("");
    }
}