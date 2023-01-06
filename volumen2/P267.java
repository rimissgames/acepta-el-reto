package volumen2;

import java.util.Scanner;

public class P267 {

	public static void main(String[] args) {
		long a, b, max;
		Scanner teclado = new Scanner(System.in);
		while (true) {
			String lineas;
			lineas = teclado.nextLine();
			String[] numeros = lineas.split(" ");
			a = Integer.parseInt(numeros[0]);
			b = Integer.parseInt(numeros[1]);
			max = Integer.parseInt(numeros[2]);
			if (a == 0 && b == 0 && max == 0) {
				return;
			}
			int res = 4;
			if (a > max) {
				res = (int) (res + (2 * (a / max)));
				if (a % max == 0) {
					res = res - 2;
				}
				if (b > max) {
					res = (int) (res + (2 * (b / max)));
					if (b % max == 0) {
						res = res - 2;
					}
				}
			}
			System.out.println(res);
			teclado.close();
		}
	}

}
