/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yelganadores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author t134009
 */
public class YelGanadorEs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] equipos;
        int numEquipos, numGlobos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de equipos: ");
        numEquipos = sc.nextInt();
        System.out.println("Dame el número de globos: ");
        numGlobos = sc.nextInt();
        equipos = new int[numEquipos];
        for (int i=1; i <= numGlobos; i++){
            int equipo = sc.nextInt();
            String color = sc.nextLine();
            equipos[equipo-1]++;
        }
        for (int i=0; i<equipos.length; i++){
            System.out.print(equipos[i] + " ");
        }
        int indexMaxArray = 0;
        for (int i=1; i < equipos.length;i++){
            if (equipos[i] > equipos[indexMaxArray]){
                indexMaxArray = i;
            }
        }
        System.out.println("");
        Arrays.sort(equipos);
        
        if (equipos[equipos.length-1] != equipos[equipos.length-2]) {
            System.out.println("El equipo ganador es: ");
            System.out.println(indexMaxArray+1);
        }else{
            System.out.println("EMPATE");
        }
        
    }
    
}
