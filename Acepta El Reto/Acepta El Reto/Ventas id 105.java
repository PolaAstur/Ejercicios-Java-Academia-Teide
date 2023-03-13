import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		double[] ventasSemanales = new double[6];
		double ventaMayorDia = 0.0, ventaMenorDia = 999999999999.99, ventaPorDia = 0.0, totVentas = 0.0;
		int indiceMayorDia = 0, indiceMenorDia = 0;
		String mediaSuperiorAlDomingo = "NO";
		
		Scanner sc = new Scanner(System.in);
		
		//Rellenamos las ventas de la Semana
		for (int i = 0; i < ventasSemanales.length; i++) {
			ventasSemanales[i] = sc.nextDouble();
			totVentas += ventasSemanales[i];
		}
		//Indice del día de mayor venta
		for (int i=0; i<ventasSemanales.length;i++) {
			if (ventasSemanales[i]>ventaMayorDia) {
				indiceMayorDia = i;
				ventaMayorDia = ventasSemanales[i];
			}				
		}
		//Indice del día de menor venta
		for (int i=0; i<ventasSemanales.length;i++) {
			if (ventasSemanales[i]<ventaMenorDia) {
				indiceMenorDia = i;
				ventaMenorDia = ventasSemanales[i];
			}				
		}
		if (ventasSemanales[ventasSemanales.length-1] > (totVentas / ventasSemanales.length))
			mediaSuperiorAlDomingo = "SI";
		System.out.print((diaDeLaSemana(indiceMayorDia) + " " + diaDeLaSemana(indiceMenorDia) + " " + mediaSuperiorAlDomingo));
	}
	
	private static String diaDeLaSemana(int indiceDia) {
		switch (indiceDia) {
			case 0:
				return "MARTES";
			case 1:
				return "MIERCOLES";
			case 2:
				return "JUEVES";
			case 3:
				return "VIERNES";
			case 4:
				return "SABADO";
			case 5:
				return "DOMINGO";			
			}
		return null;
		}
}
	
		
	


