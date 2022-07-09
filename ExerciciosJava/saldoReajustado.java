package ExerciciosJava;

import javax.swing.JOptionPane;

public class saldoReajustado {

	public static void main(String[] args) {

		String saldo = JOptionPane.showInputDialog("Entre com o saldo");

		System.out.println("O saldo digitado é: " + saldo);

		double conversao = Integer.parseInt(saldo) * (0.01) + (Integer.parseInt(saldo));

		JOptionPane.showMessageDialog(null, "O saldo reajustado + 1% é: " + conversao);

	}

}
