package tipos_variables;
import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, edad, caso = 12; //variables enteras 
		char sexo = 'f';
		boolean flag = true; // var false / true
		double precio = 12.5;
		float cantidad = 67.67f; 
		String nombre = "Juanito Alimaña";
				
		/*
		System.out.println("Juanito alimaña con mucha mañana " +nombre);
		System.out.println("el hola es " + cantidad + " total");
		*/
		while (flag) {
			Scanner captura = new Scanner (System.in);
			System.out.println("----------------------------");
			System.out.println("Selecciona MENU");
			System.out.println("Suma 1");
			System.out.println("resta 2");
			System.out.println("Salir 3");
			System.out.println("----------------------------");
			int op = captura.nextInt();
			
			int resultado, numero1,numero2;
			switch (op) {
				case 1:
					System.out.println("valor 1: ");
					numero1 = captura.nextInt();
					System.out.println("----------------------------");
					System.out.println("valor 2: ");
					numero2 = captura.nextInt();
					System.out.println("----------------------------");
					resultado = numero1 + numero2;
					System.out.println("El resultado es : "+ resultado );
					System.out.println("----------------------------");
					break;
				
				case 2:
					System.out.println("valor 1");
					numero1 = captura.nextInt();
					System.out.println("----------------------------");
					System.out.println("valor 2");
					numero2 = captura.nextInt();
					System.out.println("----------------------------");
					resultado = numero1 - numero2;
					System.out.println("El resultado es : "+ resultado );		
					System.out.println("----------------------------");
					break;
				
				case 3:
					flag = false;
					break;
					
				default:
					System.out.println("opcion no valida");
			}
		}
	 
	}
}