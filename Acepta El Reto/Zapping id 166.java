import java.util.Scanner;

public class Zapping {

	public static void main(String[] args) {
		final byte TOTAL_CANALES_TV = 99;
		final byte PRIMER_CANAL_TV = 1;
		int c1 = 0, c2 = 0, camino1=0, camino2 = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dame el c�digo del primer canal: ");
			c1 = sc.nextInt();
			System.out.println("Dame el c�digo del segundo canal: ");
			c2=sc.nextInt();
			camino1 = (Math.max(c1, c2) - Math.min(c1, c2))+PRIMER_CANAL_TV;
			camino2 = (TOTAL_CANALES_TV-Math.max(c1, c2)+(Math.min(c1, c2)-1))+PRIMER_CANAL_TV;
			System.out.println("Camino �ptimo: " + Math.min(camino1, camino2));
		}while (c1!=0 && c2!=0);
	}

}
