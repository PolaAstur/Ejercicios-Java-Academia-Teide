import java.util.Arrays;
import java.util.Scanner;

public class CarreraSanFermin {

	public static void main(String[] args) {
		int[] arrayVelocidades;
		int numToros = 1, velocidadDelToro = 0, maximaVelocidad = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el n�mero de toros : ");
		arrayVelocidades = new int[sc.nextInt()];
		//Rellenamos las velocidades de los toros
		for (int i=0; i < arrayVelocidades.length; i++) {
			System.out.println("Dame la velocidad del toro : ");
			arrayVelocidades[i] = sc.nextInt();
		}
		Arrays.sort(arrayVelocidades);
		System.out.println(arrayVelocidades[arrayVelocidades.length-1]);
	}
}
