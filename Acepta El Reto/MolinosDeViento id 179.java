/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package molinosdeviento;

import java.util.Scanner;

/**
 *
 * @author t134009
 */
public class MolinosDeViento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        int[] arrayMolinosDeViento;        
        int numMolinosDeViento, numConsultas, posInicial, posFinal, sumEnergia = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de molinos de viento");
        numMolinosDeViento = sc.nextInt();
        arrayMolinosDeViento = new int[numMolinosDeViento];
        for (int i = 0; i < arrayMolinosDeViento.length; i++){
            System.out.println("Dime la energía del molino");
            arrayMolinosDeViento[i] = sc.nextInt();
        }
        System.out.println("Dame el número de consultas");
        numConsultas = sc.nextInt();
        for (int i = 1; i <= numConsultas; i++){
            sumEnergia = 0;
            System.out.println("Posición inicial");
            posInicial = sc.nextInt();
            System.out.println("Posición final");
            posFinal = sc.nextInt();
            for (int j = posInicial-1; j <= posFinal-1; j++){
                sumEnergia+=arrayMolinosDeViento[j];
            }
            System.out.println(sumEnergia);
        }
    }
    
}
