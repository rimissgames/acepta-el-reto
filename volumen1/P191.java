package volumen1;

import java.util.Scanner;

public class P191 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont = teclado.nextInt();
		teclado.nextLine();
	
		for (int i = 0; i < cont; i++) {
			String lineas = teclado.nextLine();
			String[] numeros = lineas.split(" ");
			int compartimentos = Integer.parseInt(numeros[0]);
			int l = Integer.parseInt(numeros[1]);
			int d = Integer.parseInt(numeros[2]);
			int diferencia = l+d;
			int total = 0;
			
			if(compartimentos>0 && 1>0 && d>=0) {
				for(int j=0; j<compartimentos; j++) {
					diferencia -= d;
					total += diferencia;
				}
			}
			System.out.println(total);
		}
		teclado.close();
	}

}
