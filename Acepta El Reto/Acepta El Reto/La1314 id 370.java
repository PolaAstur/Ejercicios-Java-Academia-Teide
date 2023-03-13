import java.util.Scanner;

public class La1314 {
	public static void main(String[] args) {
		int numCasosDePrueba = 0;
		int extremMinimo = 0, extremMaximo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de casos de prueba: ");
		numCasosDePrueba = sc.nextInt();
		for (int i = 1; i<= numCasosDePrueba; i++) {
			System.out.println("Introduce dos números separados por un espacio: ");
			extremMinimo = sc.nextInt();			
			extremMaximo = sc.nextInt();
			extremMinimo = Math.min(extremMinimo, extremMaximo);
			extremMaximo = Math.max(extremMinimo,extremMaximo);
			if (extremMinimo % 2 == 0 && extremMaximo-extremMinimo==1) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
	}
}
