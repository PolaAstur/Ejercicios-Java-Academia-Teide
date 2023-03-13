

import java.util.*;

public class SanFermines {

	public static void main(String[] args) {
		int[] arrayVelocidades = null;
		int numCorredores;
		
		Scanner sc = new Scanner(System.in);//numCasosDePrueba = sc.nextInt();
			numCorredores = sc.nextInt();
			if (numCorredores >= 1) { 
			arrayVelocidades = new int[numCorredores];
			
				//Rellenamos las velocidades de los toros
				for (int j=0; j < arrayVelocidades.length; j++) {				
					arrayVelocidades[j] = sc.nextInt();
				}
				Arrays.sort(arrayVelocidades);
				System.out.println(arrayVelocidades[arrayVelocidades.length-1]);
			}
					
		
	}
}

