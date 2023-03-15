import java.util.Arrays;
import java.util.Scanner;

public class CalculoDeLaMediana {

	public static void main(String[] args) {
		int[] arrayValores;
		int totValoresArray = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el número total de valores: ");
		totValoresArray = sc.nextInt();
		arrayValores = new int[totValoresArray];
		for (int i=0; i<arrayValores.length;i++) {
			arrayValores[i] = sc.nextInt();
		}
		Arrays.sort(arrayValores);
		if (arrayValores.length % 2!= 0) {
			System.out.print(2 * arrayValores[arrayValores.length / 2]);
		}else {			
			System.out.print(((arrayValores[arrayValores.length/2] + 
					arrayValores[(arrayValores.length/2)-1])/2.0)*2);
		}
	}

}
