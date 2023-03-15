import java.util.Scanner;

public class PenaAtletica {

	public static void main(String[] args) {
		int numDecimos = 0, totNumPares = 0;
		int[] numerosCadaDecimo;
		
		Scanner sc = new Scanner(System.in);
		numDecimos = sc.nextInt();
		numerosCadaDecimo = new int[numDecimos];
		for (int i=0; i<numerosCadaDecimo.length;i++) {
			numerosCadaDecimo[i] = sc.nextInt();
			if (numerosCadaDecimo[i] % 2 == 0)
				totNumPares++;
		}
		System.out.print(totNumPares);
	}

}
