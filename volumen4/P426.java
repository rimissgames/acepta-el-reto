/**
 * 
 */
package volumen4;

import java.util.Scanner;

/**
 * @author DAW120
 *
 */
public class P426 {

	public static void main(String[] args) {
		long numNinos, numCaramelos, caramelos;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			caramelos = sc.nextLong();
			if(caramelos==0) {
				break;
			}
			numNinos = 0;
			numCaramelos = 0;
			numCaramelos = numCaramelos + caramelos;
			numNinos++;
			while(true) {
				caramelos = sc.nextLong();
				if(caramelos==0) {
					break;
				}
				numCaramelos = numCaramelos + caramelos;
				numNinos++;
			}
			if(numCaramelos%numNinos!=0) {
				System.out.printf("IMPOSIBLE\n");
			} else {
				System.out.printf("REPARTO JUSTO\n");
			}
		}
		return;
	}

}
