package ExerciciosJava;

public class CalculosIpi {

	public static void main(String[] args) {

		String codigoProd = "Mouse";
		int quantidade1 = 1;
		double valor1 = 50.00;

		String codigoProd2 = "Teclado";
		int quantidade2 = 1;
		double valor2 = 100;

		double ipi = 5.0 / 100;

		double r = (valor1 + (quantidade1 * valor1 * ipi));
		double x = (valor2 + (quantidade2 * valor2 * ipi));

		System.out.println("Produtos: " + codigoProd + " --- " + codigoProd2 + " --- " +" O valor total é R$:" + (r + x));
	}

}
