/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potitos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author t134009
 */
public class Potitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> ingrQueSi = new ArrayList<String>();
        ArrayList<String> ingrQueNo = new ArrayList<String>();
        int numPotitos = 0;
        String ingredientes = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de potitos");
        numPotitos = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=numPotitos; i++){
            System.out.println("Introduce los ingredientes del potito " + i);
            
            ingredientes = sc.nextLine();
            
            String[] ingredIndividuales = ingredientes.split(" ");
            if (ingredIndividuales[0].toUpperCase().equals("SI:")){
                for (int j = 1; j < ingredIndividuales.length-1; j++){
                    ingrQueSi.add(ingredIndividuales[j].toLowerCase());
                }
            }else if (ingredIndividuales[0].toUpperCase().equals("NO:")){
                for (int j = 1; j < ingredIndividuales.length-1; j++){
                    ingrQueNo.add(ingredIndividuales[j].toLowerCase());
                }
            }
        }
        //Recorro el ArrayList con ingredientes que no le gustan y compruebo
       //si estan en el ArrayList de los ingredientes que le gustan       
       for (int k = 0; k < ingrQueNo.size(); k++) {
            String elemento = ingrQueNo.get(k);
            if (ingrQueSi.contains(elemento)) {
                ingrQueNo.remove(elemento);
                k--;
            }
        }
       Collections.sort(ingrQueNo);
       System.out.println(ingrQueNo.toString());
    }
    
}
