import java.util.*;
public class LaPiezaPerdida {

	public static void main(String[] args) {
		int totPiezas = 0, posPieza = 0;
		int[] piezaPuzzle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el n�mero de piezas: ");
		totPiezas = sc.nextInt();
		piezaPuzzle = new int[totPiezas];
		for (int i=0; i<piezaPuzzle.length-1; i++) {
			posPieza = sc.nextInt();
			piezaPuzzle[posPieza-1]=posPieza;
		}
		for (int i=0; i<piezaPuzzle.length; i++) {
			if (piezaPuzzle[i]==0) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
