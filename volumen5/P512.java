package volumen5;

import java.util.Scanner;

public class P512 {

	public static void main(String[] args) {

		int numCasos = 0, peso1, peso2;
		Scanner teclado = new Scanner(System.in);
		numCasos=teclado.nextInt();
		for(int i=0; i<numCasos; i++) {
			peso1 = teclado.nextInt();
			peso2 = teclado.nextInt();
			System.out.printf("%d\n", (int)(peso1*100.0/(peso1+peso2)));
		}
		teclado.close();
	}
}
