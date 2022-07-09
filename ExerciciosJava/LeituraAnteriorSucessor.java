package ExerciciosJava;

import java.util.Scanner;

public class LeituraAnteriorSucessor {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			int n;

			System.out.println("Informe um número: ");
			n = ler.nextInt();

			System.out.println("Número digitado " + n);
			System.out.println("Número anterior " + (n - 1));
			System.out.println("Número sucessor " + (n + 1));
		}

	}

}
