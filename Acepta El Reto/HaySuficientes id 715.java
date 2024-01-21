/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package haysuficientes;

import java.util.Scanner;

/**
 *
 * @author t134009
 */
public class HaySuficientes {
    static final byte totalUvas = 12;
    static final byte valInicial = 1;
    static final int valFinal = 1000000000;
    
    public static void main(String[] args) {
        int totUvasCompradas = 0, totComensales = 0, totCasosDePrueba = 0;        
        String respuesta = "";
        Scanner sc = new Scanner (System.in);
        
        totCasosDePrueba = sc.nextInt();        
        for (int i = 1; i<=totCasosDePrueba; i++){
            totUvasCompradas = sc.nextInt();
            totComensales = sc.nextInt();
            if ((totUvasCompradas >= valInicial && totUvasCompradas <= valFinal) && 
                    (totComensales >= valInicial && totComensales <= valFinal)){
               respuesta = (totUvasCompradas >= (totComensales * totalUvas) ? "SI":"NO");
               System.out.println(respuesta); 
            }
        }        
    }    
}
