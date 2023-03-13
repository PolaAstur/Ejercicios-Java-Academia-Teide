import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SaltosDeTrampolin {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("#");
		double[] notasDeSalto = new double[7];
		double nota = 0.0, sum=0.0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<notasDeSalto.length;i++) {
			System.out.println("Dime tu puntuación: ");
			notasDeSalto[i] = sc.nextDouble();
		}
		
		Arrays.sort(notasDeSalto);
		for (int i=2; i<notasDeSalto.length-2;i++) {
			sum+=notasDeSalto[i];
		}
		System.out.println("Puntuación final: " + formato.format((sum * 2)));
	}

}
