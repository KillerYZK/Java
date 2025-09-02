package mate;

import java.util.*;

public class mat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Programa para calcular la distancia entre puntos 
		
		Scanner captura = new Scanner (System.in);
		
		float x1,x2,x3,y1,y2,y3, ab,bc,ca;
		
		//Punto A
		System.out.println("--------------------------");
		System.out.println("| Ingrese el valor de 1x  |");
		System.out.println("--------------------------");
		x1 = captura.nextInt();
		
		System.out.println("--------------------------");
		System.out.println("| Ingrese el valor de 1y  |");
		System.out.println("--------------------------");
		y1 = captura.nextInt();
		
		//Punto B
		System.out.println("--------------------------");
		System.out.println("| Ingrese el valor de 2x  |");
		System.out.println("--------------------------");
		x2  = captura.nextInt();
		
		System.out.println("--------------------------");
		System.out.println("| Ingrese el valor de 2y  |");
		System.out.println("--------------------------");
		y2 = captura.nextFloat();
		
		//Punto C
		System.out.println("--------------------------");
		System.out.println("| Ingrese el valor de 3x  |");
		System.out.println("--------------------------");
		x3  = captura.nextFloat();
		
		System.out.println("--------------------------");
		System.out.println("| Ingrese el valor de 3y  |");
		System.out.println("--------------------------");
		y3 = captura.nextFloat();
		
		ab = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		bc = (float) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		ca = (float) Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		System.out.println("\nDistancias entre los puntos:");
		System.out.println("Distancia AB: " + ab);
		System.out.println("Distancia BC: " + bc);
		System.out.println("Distancia CA: " + ca);

		if (ab == bc && bc==ca && ca==ab){	
			System.out.println("Es un triangulo equilátero");
		}
			else if  (ab == bc || bc == ca || ab == ca)  {
				System.out.println("Es un triangulo Isósceles");
		}
			else {
				System.out.println("Es un triangulo Escaleno");

			}
		
		
		
		
	}

}
