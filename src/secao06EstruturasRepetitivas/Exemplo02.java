package secao06EstruturasRepetitivas;

public class Exemplo02 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		for (int i = 0; i < x; i++) {
			System.out.print("Valor de i " + i + " ");
			y += 5;
			System.out.println(y);
		}

	}

}