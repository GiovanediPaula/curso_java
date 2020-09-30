package secao06EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio001NumImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			if( i % 2 != 0) {
				System.out.println("Numero impar: " + i);
			}
		}
			
		sc.close();

	}

}
