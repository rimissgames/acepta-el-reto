/**
 * 
 */
package volumen1;

import java.util.Scanner;

/**
 * @author noelp
 *
 */
public class P155 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leo = new Scanner(System.in);
		int x, y;
		x = leo.nextInt();
		y = leo.nextInt();
		while(x>=0 && y>=0) {
			System.out.println(x*2 + y*2);
			
			x = leo.nextInt();
			y = leo.nextInt();
		}
		leo.close();
	}

}
