import java.util.Scanner;

public class Nochevieja {

	public static void main(String[] args) {
		String horaCompleta = "";
		int minutos = 0, hora = 0;
		
		Scanner sc = new Scanner (System.in);
		do {
			horaCompleta = sc.nextLine();
			hora = Integer.parseInt(horaCompleta.substring(0,2));
			minutos = Integer.parseInt(horaCompleta.substring(3));
			if (minutos!=0) {
				minutos = 60 - minutos;
				System.out.println(((24-(hora+1))*60) + minutos);
			}
		}while (minutos!= 0);		
	}

}
