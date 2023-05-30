/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reduciendoenvases;

import java.util.Scanner;

/**
 *
 * @author t134009
 */
public class ReduciendoEnvases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int casosDePrueba = 0;
        int pesoNetoProducto = 0, pesoTotalMedido = 0;
        Scanner sc = new Scanner(System.in);
        casosDePrueba = sc.nextInt();
        for (int i=1; i<=casosDePrueba; i++){
            pesoNetoProducto = sc.nextInt();
        pesoTotalMedido = sc.nextInt();
            if (pesoNetoProducto >= 1 && pesoNetoProducto<=1000){
                if (pesoTotalMedido >=1 && pesoTotalMedido<=1000){
                    System.out.println((pesoTotalMedido - pesoNetoProducto));
                }
            }
        }        
    }
    
}
