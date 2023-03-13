import java.util.Scanner;

public class CuantasMeLlevo {

	public static void main(String[] args) {
		int numero1, numero2, totAcarreos = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número: ");
		numero1 = sc.nextInt();
		System.out.println("Dame otro número: ");
		numero2 = sc.nextInt();
		
		String numeroStr = Integer.toString(numero1);
		char[] numeroChar = numeroStr.toCharArray();
		int[] numeroArr = new int[numeroChar.length];

		for (int i = 0; i < numeroChar.length; i++) {
		    numeroArr[i] = Character.getNumericValue(numeroChar[i]);
		}

		String numeroStr2 = Integer.toString(numero2);
		char[] numeroChar2 = numeroStr2.toCharArray();
		int[] numeroArr2 = new int[numeroChar2.length];

		for (int i = 0; i < numeroChar2.length; i++) {
		    numeroArr2[i] = Character.getNumericValue(numeroChar2[i]);
		}
		
		for (int i=0; i<numeroArr.length;i++) {
			if (numeroArr[i] + numeroArr2[i]>9) totAcarreos++;
		}
		System.out.println(totAcarreos);
	}

}
