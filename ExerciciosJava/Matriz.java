package ExerciciosJava;

public class Matriz {

	public static void main(String[] args) {

		int notas[][] = new int[1][3];

		notas[0][0] = 80;
		notas[0][1] = 20;
		notas[0][2] = 50;

		notas[1][0] = 70;
		notas[1][1] = 90;
		notas[1][2] = 85;

		for (int poslinha = 0; poslinha < notas.length; poslinha ++) {

			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna ++) {
				
				System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);

			}

		}

	}

}
