package Mat;

import java.util.*;

public class Mat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[15];
		int num, contador_neg;
		Scanner captura = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) { 
			 
			System.out.println("|Dame un valor: "+ i);
			num = captura.nextInt();
			numeros [i] = num;
			System.out.println("-------------------------");
		}
		for (int x = 0; x < numeros.length; x++){
		
			String n = numeros [x]%2 == 0 ? "hola" : "no";
		
			if(numeros[x]%2 == 0 && numeros [x] > 0) {
				double raiz;
				raiz = Math.sqrt(numeros[x]);
				System.out.println("-------------------------");
				System.out.println("La raiz cudrada de: "+ numeros[x]+ " "+ raiz);
			
		}
			
			
	}
	}

}