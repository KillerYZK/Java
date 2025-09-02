//
package arreglos;
import java.util.Scanner;

public class Estandares {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] edades = new int[5]; 
		
		Scanner captura = new Scanner(System.in);
		
		for (int i=0; i < edades.length; i++) {
			System.out.println("Dale una edad: "+i);
			edades[i] = captura.nextInt();
		
			
		}
			int x = 0;
			while (x < edades.length) {
				System.out.println("Valor de X" + edades[x]);
				x++;

	}
	
}

}