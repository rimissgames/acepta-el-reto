package volumen4;

import java.util.Scanner;

public class P433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numUvas, numPrueba, suma;
		while(true) {
			numUvas = sc.nextLong();
			if(numUvas==0) {
				break;
			}
			suma = 0;
			for(numPrueba=1; suma < numUvas; numPrueba++) {
				suma = numPrueba*(numPrueba+1)/2;
			}
			System.out.println(--numPrueba);
		}
	}
}
