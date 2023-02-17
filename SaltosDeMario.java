import java.util.Arrays;
import java.util.Scanner;

public class SaltosDeMario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] arrayMuros;
		int saltosArriba =0, saltosAbajo = 0, numMuros = 0;
		System.out.println("Dame el n�mero de muros: ");
		numMuros = sc.nextInt();
		arrayMuros = new int[numMuros];
		for (int i=0; i<arrayMuros.length; i++) {
			System.out.println("Teclea la altura del muro: " );
			arrayMuros[i] = sc.nextInt();			
		}
		for (int i=0; i<arrayMuros.length-1; i++) {
			if (arrayMuros[i] < arrayMuros[i+1]) {
				saltosArriba ++;
			}else if (arrayMuros[i] > arrayMuros[i+1]) {
				saltosAbajo ++;
			}
		}
		System.out.println(saltosArriba + " " + saltosAbajo);		
	}
}
