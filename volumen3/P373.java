package volumen3;

import java.util.Scanner;

public class P373 {

	public static void main(String[] args) {
		int numCasos;
		long n;
		Scanner teclado = new Scanner(System.in);
		numCasos=teclado.nextInt();
		for(int i=0; i<numCasos; i++) {
			n=teclado.nextLong();
			System.out.printf("%d\n", 6*(n-1)*(n-1)+2);
		}
		teclado.close();
	}
}
