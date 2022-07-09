package ExerciciosJava;

import javax.swing.JOptionPane;

public class Salario {
	
	public static void main(String[] args) {
		
		int salarioMinimo = 1200;
		
		String salarioUsuario = JOptionPane.showInputDialog("Qual salário mínimo");
		
		double r = Integer.parseInt(salarioUsuario)/salarioMinimo;
		
		System.out.println("Valor do salário mínimo: " + salarioMinimo);
		System.out.println("Quantidade de salários: " + r);

	}

}
