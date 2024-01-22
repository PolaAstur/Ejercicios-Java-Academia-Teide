/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queladodelacalle;

import java.util.Scanner;

/**
 *
 * @author t134009
 */
public class QueLadoDeLaCalle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numCalle = 0;
        String queLadoDeLaCalle = "";
        Scanner sc = new Scanner(System.in);
        do{
            numCalle = sc.nextInt();
            if (numCalle == 0) break;
            if (numCalle <= 1000){
                queLadoDeLaCalle = numCalle % 2 == 0? "DERECHA":"IZQUIERDA";
                System.out.println(queLadoDeLaCalle);
            }            
        }while (numCalle != 0);
    }
    
}
