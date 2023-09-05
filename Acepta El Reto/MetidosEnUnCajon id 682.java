/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metidosenuncajon;

import java.util.Scanner;

/**
 *
 * @author T134009
 */
public class MetidosEnUnCajon {

    /**
     * @param args the command line arguments
     */
        static final int VALOR_INICIAL = 1;
        static final int VALOR_FINAL = 100000;
    public static void main(String[] args) {
        int totalCasosDePrueba = 0, numPatos = 0;
        
        Scanner sc = new Scanner(System.in);
       
        totalCasosDePrueba = sc.nextInt();
        for (int i=1; i<=totalCasosDePrueba; i++){
            numPatos = sc.nextInt();
            if (numPatos >= VALOR_INICIAL && numPatos <= VALOR_FINAL)
                System.out.println(numPatos + " " + numPatos * 2);
        }
    }
    
}
