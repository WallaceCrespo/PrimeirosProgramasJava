package ExerciciosJava;

import java.util.Scanner;

public class LeituraAnteriorSucessor {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			int n;

			System.out.println("Informe um n�mero: ");
			n = ler.nextInt();

			System.out.println("N�mero digitado " + n);
			System.out.println("N�mero anterior " + (n - 1));
			System.out.println("N�mero sucessor " + (n + 1));
		}

	}

}
