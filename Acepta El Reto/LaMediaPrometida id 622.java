/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamediaprometida;


import java.util.Scanner;

/**
 *
 * @author T134009
 */
public class LaMediaPrometida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int notaPrometida = 0;
        String notas = "";
        String[] todasNotas;
        int suma = 0;
        byte x = 0;
          
        do{
            Scanner sc = new Scanner(System.in);
            x = sc.nextByte();
            sc.nextLine();
            if (x == 0) break;
            notas = sc.nextLine();
            todasNotas = notas.split(" ");

            notaPrometida = sc.nextInt();
            for (int i=0; i<todasNotas.length; i++){
                suma += Integer.parseInt(todasNotas[i]);
            }
            int n;

            n = ((notaPrometida * (todasNotas.length+1)) - suma > 10) ? 1 : 0;
            if (n == 1)
                System.out.println("IMPOSIBLE");
            else
                System.out.println((notaPrometida * (todasNotas.length+1)) - suma);
            suma = 0;
        }while (x != 0);        
    }
}
 