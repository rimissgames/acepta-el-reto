package volumen3;

import java.util.Scanner;

public class P368 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int huevos=teclado.nextInt();
		int capacidad=teclado.nextInt();
		while(huevos!=0) {
			int minutos=huevos/capacidad;
			if(huevos%capacidad!=0) minutos++;
			System.out.println(minutos*10);
			huevos=teclado.nextInt();
			capacidad=teclado.nextInt();
	}
		teclado.close();
	}

}
