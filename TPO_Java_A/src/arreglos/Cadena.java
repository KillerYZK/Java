package arreglos;
import java.util.*;
public class Cadena { 
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]nombres; // declaracion de un arreglo
		String[]estados = new String[5]; //Cantidad de almacenamiento del arreglo
		
		estados[0] = "Jalisco"; 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("--------------------------------------");
		System.out.println("Cuantos elementos quieres guardar:");
		int elemento = sc.nextInt();
		
		
		nombres = new String [elemento];
		for (int y = 0; y < nombres.length; y++) {
			System.out.println("-------------------------------");
			System.out.println("Nombre: " + y);
			nombres [y] = sc.next();
		}
		System.out.println("---Nombres Guardados---");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		
	
 }
}