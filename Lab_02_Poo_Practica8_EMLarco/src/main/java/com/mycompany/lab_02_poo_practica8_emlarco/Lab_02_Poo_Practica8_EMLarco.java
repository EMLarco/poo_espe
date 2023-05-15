package com.mycompany.lab_02_poo_practica8_emlarco;

import javax.swing.JOptionPane;

public class Lab_02_Poo_Practica8_EMLarco {

    public static void main(String[] args) {
        //Creo el objeto
        
        Operaciones operacion1= new Operaciones();
        
        operacion1.capturarnumeros();
        //Para pedir que ingrese los numeros en pantalla
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Deme su Primer Numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme su Segundo Numero"));
        
        int resta=operacion1.restar(num1, num2);
        int suma=operacion1.sumar(num1,num2);
        int multiplicar=operacion1.multiplicacion(num1, num2);
        int dividir=operacion1.division(num1, num2);
        
        operacion1.resultados(suma,resta,multiplicar,dividir);


    }

}
