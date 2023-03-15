package ex_05;

/**
 * @author Jhonata Lopes dos Santos 
 * 
 */

import java.util.Scanner;

public class InverteString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("*-- INVERTE STRING --*");
		System.out.print("Digite uma string: ");
		String stringDigitada = input.next();
		String invertida = inverter(stringDigitada);
		System.out.println("A String invertida é " + invertida);
	}

	public static String inverter(String stringDigitada) {
		String stringInvertida = "";

		for (int i = stringDigitada.length() - 1; i >= 0; i--) {
			stringInvertida += stringDigitada.charAt(i);
		}
		return stringInvertida;
	}
}