package ExerciciosJava;

import javax.swing.JOptionPane;

public class Salario {
	
	public static void main(String[] args) {
		
		int salarioMinimo = 1200;
		
		String salarioUsuario = JOptionPane.showInputDialog("Qual sal�rio m�nimo");
		
		double r = Integer.parseInt(salarioUsuario)/salarioMinimo;
		
		System.out.println("Valor do sal�rio m�nimo: " + salarioMinimo);
		System.out.println("Quantidade de sal�rios: " + r);

	}

}
