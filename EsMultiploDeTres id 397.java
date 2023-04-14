import java.util.Scanner;

public class EsMultiploDeTres {

	public static void main(String[] args) {
		int numero=0; float suma = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número");
		numero = sc.nextInt();
		for (int i=1; i<=numero;i++) {
			suma+=i;
		}
		System.out.println(suma);
		System.out.println((suma % 3==0)?"SI":"NO");
	}

}
