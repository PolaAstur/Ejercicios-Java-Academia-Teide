import java.util.*;

public class MatrizIdentidad {

	public static void main(String[] args) {
		int[][] miMatriz;
		int dimension = 0;
		//La variable miMatriz solo puede guardar valores comprendidos entre (1 y 9)
		//para hacer el programa más versatil creo esos valores como constantes
		final int VALOR_MINIMO = 1;
		final int VALOR_MAXIMO = 9;
		final byte DIMENSION_MAXIMA_MATRIZ = 50;
		Scanner sc = new Scanner(System.in);		
		do {
			System.out.println("Dame la dimensión de la matriz: ");
			dimension = sc.nextInt();
			if (dimension <= DIMENSION_MAXIMA_MATRIZ) {
				miMatriz = new int[dimension][dimension];
				RellenarMatriz(miMatriz, VALOR_MINIMO, VALOR_MAXIMO);
				EscribirMatriz(miMatriz);
				if (MatrizEsIdentidad(miMatriz)) {
					System.out.println("SI");
				}else {
					System.out.println("NO");
				}
			}			
		}while (dimension!=0);
	}

	private static boolean MatrizEsIdentidad(int[][] miMatriz) {
		
		//Compruebo la diagonal principal, los indices de la diagonal principal son las parejas
		// (0,0) (1,1) (2,2),.....(n,n) por este motivo con un solo bucle For me vale
		for (int i = 0; i < miMatriz.length; i++) {
			if (miMatriz[i][i]!=1) {
				return false;				
			}
		}	
		//Compruebo el resto de elementos de la matriz, todos tienen que ser igual a cero
		for (int i = 0; i < miMatriz.length; i++) {
			for (int j = 0; j < miMatriz[0].length; j++) {
				//Si alguno de los números de la matriz no son cero y el número no pertenece 
				//a la diagonal principal la matriz no es identidad. 
				if ((i!=j) && (miMatriz[i][j]!=0)) {
					return false;
				}
			}			
		}
		return true;
	}

	private static void EscribirMatriz(int[][] miMatriz) {
		for (int i = 0; i < miMatriz.length; i++) {
			for (int j = 0; j < miMatriz[0].length; j++) {
				System.out.print(miMatriz[i][j]);
			}
			System.out.println();
		}	
	}

	private static void RellenarMatriz(int[][] miMatriz, int vALOR_MINIMO, int vALOR_MAXIMO) {
		Random rand = new Random();
		
		for (int i = 0; i < miMatriz.length; i++) {
			for (int j = 0; j < miMatriz[0].length; j++) {
				miMatriz[i][j]= rand.nextInt((vALOR_MAXIMO - vALOR_MINIMO) + 1) + vALOR_MINIMO;
			}
		}		
	}

}
