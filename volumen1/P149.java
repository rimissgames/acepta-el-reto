/**
 * 			San Fermines
 */
package volumen1;

import java.util.Scanner;

/**
 * 
 *
 */
public class P149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numCasos, velocidad, max;
		while (sc.hasNext()) {
			numCasos = sc.nextLong();
			max = 0;
			while (numCasos-- > 0) {
				velocidad = sc.nextLong();
				if (velocidad > max)
					max = velocidad;
			}
			System.out.println(max);
		}
	}
}