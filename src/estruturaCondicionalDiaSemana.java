import java.util.Scanner;

public class estruturaCondicionalDiaSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		if (x == 1) {
			dia = "Domingo";
		}
		else if (x ==2) {
			dia = "Segunda-Feira";
		}
		else if (x ==3) {
			dia = "Ter�a-Feira";
		}
		else if (x == 4) {
			dia = "Quarta-Feira";
		}
		else if (x == 5) {
			dia = "Quinta-Feira";
		}
		else if (x == 6) {
			dia = "Sexta-Feira";
		}
		else if (x ==7) {
			dia = "S�bado";
		}
		else {dia = "Dia inv�lido";
		}
		
		System.out.println("Dia da semama: " + dia);
		sc.close();
	}

}
