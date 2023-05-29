/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abuelamaria;

import java.util.Scanner;

/**
 *
 * @author T134009
 */
public class AbuelaMaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] dientesSuperiores = new int[6];
       int[] dientesInferiores = new int[6];
       int totCasosDePrueba = 0;
       boolean allCoinciden = true;
       Scanner sc = new Scanner(System.in);
       System.out.println("Dime el total de casos de prueba: ");
       totCasosDePrueba = sc.nextInt();
       for (int i=1; i<=totCasosDePrueba; i++){
           System.out.println("Teclea los dientes superiores");
           for (int k=0; k<dientesSuperiores.length; k++){
               dientesSuperiores[k] = sc.nextInt();
           }
           System.out.println("Teclea los dientes inferiores");
           for (int k=0; k<dientesInferiores.length; k++){
               dientesInferiores[k] = sc.nextInt();
           }
           int[] dientesInferioresReverse = new int[6];
           int aux = 0;
           for (int k=dientesInferiores.length-1; k>=0; k--){
               dientesInferioresReverse[aux]=dientesInferiores[k];
               aux++;
           }
           for (int k=0; k<dientesSuperiores.length;k++){
               if (dientesSuperiores[k]!= dientesInferioresReverse[k]){
                   allCoinciden = false;
                   break;
               }
           }
           
           if (!allCoinciden) System.out.println("NO");
           else System.out.println("SI");
       }
    }
    
}
