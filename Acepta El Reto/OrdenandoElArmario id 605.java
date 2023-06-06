/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenandoelarmario;

import java.util.Scanner;

/**
 *
 * @author T134009
 */
public class OrdenandoElArmario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
         Runtime runtime = Runtime.getRuntime();
        int prendaVerano = 0, prendaInvierno = 0;
        String[] tipoPrendas;       
        Scanner sc = new Scanner(System.in);
        do{
            tipoPrendas = sc.nextLine().split(" ");
            if (tipoPrendas[0].equals(".")) break;
            for (int i=0; i<tipoPrendas.length-1;i++){                
                if (tipoPrendas[i].equals("V"))
                    prendaVerano ++;
                else if (tipoPrendas[i].equals("I"))
                    prendaInvierno ++;   
            }
            
            if (prendaVerano > prendaInvierno)
                System.out.println("VERANO");
            else if(prendaVerano < prendaInvierno)
                System.out.println("INVIERNO");
            else
                System.out.println("EMPATE");
            prendaVerano = 0;
            prendaInvierno = 0;
        }while(!tipoPrendas[0].equals("."));
    }
}
