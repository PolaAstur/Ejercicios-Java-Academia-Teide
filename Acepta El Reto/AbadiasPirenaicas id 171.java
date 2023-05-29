/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abadiaspirenaicas;

import java.util.Scanner;

/**
 *
 * @author T134009
 */
public class AbadiasPirenaicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cordilleras = "";
        int numMontanas = 0;
        int altura = 0, totAbadias = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de montañas: ");
        numMontanas = sc.nextInt();
        sc.nextLine();
        cordilleras = sc.nextLine();
        String[] montCordillera = (cordilleras.split(" "));
        for (int i=0; i<montCordillera.length; i++){
            altura = Integer.parseInt(montCordillera[i]);
            for (int j=i+1; j<montCordillera.length;j++){
                if (altura > Integer.parseInt(montCordillera[j])){
                    totAbadias ++;
                }else{
                    totAbadias = 0;
                    break;
                }
            }
            if (totAbadias > 0)break;
        }
        System.out.println(totAbadias);
    }
    
}
