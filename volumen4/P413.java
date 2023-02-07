/**
 * 			Claras y oscuras
 */
package volumen4;

import java.util.Scanner;

/**
 * 
 */
public class P413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCasos = sc.nextInt();
		for (int i = 0; i < numCasos; i++) {
			int filas = sc.nextInt();
			int columnas = sc.nextInt();
			int huecos = filas * columnas;
			if (huecos % 2 == 0) {
				System.out.println(huecos / 2 + " " + huecos / 2);
			} else {
				System.out.println(huecos / 2 + 1 + " " + huecos / 2);
			}
		}
	}
}
