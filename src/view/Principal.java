package view;

import javax.swing.JOptionPane;

import controller.FatorialRecursivo;

public class Principal {

	public static void main(String[] args) {
		FatorialRecursivo fc = new FatorialRecursivo();
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero inteiro <= 12."));
		int fatorial = fc.fatorialRecursivo(n);
		JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é: " + fatorial);
	}
}