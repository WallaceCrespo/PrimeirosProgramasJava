package ExerciciosJava;

import java.util.Scanner;

public class repeticaoJava {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			int n;
			
			System.out.println("Insira o n�mero para contagem: ");
			n = ler.nextInt();
			
			while (n <= 15) {
				System.out.println(n);
				n++;

			}
		}

	}

}
