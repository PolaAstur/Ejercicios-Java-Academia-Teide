import java.util.Scanner;

public class NocheVieja {

	public static void main(String[] args) {
		String horaCompleta = "";
		int minutos = 0, hora = 0;
		boolean error = true;
		
		Scanner sc = new Scanner (System.in);
		do {
			horaCompleta = sc.nextLine();
			hora = Integer.parseInt(horaCompleta.substring(0,2));
			if (hora <= 23) {
				minutos = Integer.parseInt(horaCompleta.substring(3));
				if (minutos!=0 && minutos < 60) {
					minutos = 60 - minutos;
					System.out.println(((24-(hora+1))*60) + minutos);
				}else if (minutos > 59) {
					error = true;
				}
			}else {
				error = true;
			}
			if (hora == 0 && minutos == 0) error = false;
		}while (error);

	}

}
