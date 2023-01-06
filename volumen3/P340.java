package volumen3;

import java.util.Scanner;

public class P340 {

	public static void main(String[] args) {
		int numCasos, n, m;
		Scanner teclado = new Scanner (System.in);
		numCasos=teclado.nextInt();
		for(int i=0; i<numCasos; i++) {
			n=teclado.nextInt();
			m=teclado.nextInt();
			System.out.printf("%d\n",m*(n+1)+n*(m+1));
		}
		teclado.close();
	}
}
