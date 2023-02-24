import java.util.Scanner;

public class CartasDelAbuelo {

	public static void main(String[] args) {
		String cartaDelAbuelo = "";
		int numCasosDePrueba = 0, iniPos = 0, finPos = 0;		
		char caracter;
		String carRepetida = "SI"; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la carta: ");
		cartaDelAbuelo = sc.nextLine();
		char[] arrayCartaDelAbuelo = cartaDelAbuelo.toCharArray();
		System.out.println("Posición Inicial: ");
		iniPos = sc.nextInt();
		System.out.println("Posición Final: ");
		finPos = sc.nextInt();
		iniPos = Math.min(iniPos, finPos);
		finPos = Math.max(iniPos, finPos);
		caracter = arrayCartaDelAbuelo[iniPos];
		iniPos++;
		for (int i = iniPos; i <= finPos; i++) {
			if (caracter != arrayCartaDelAbuelo[i]) {
				carRepetida = "NO";
				break;
			}			
		}
		System.out.println(carRepetida);
	}

}
