package br.com.fiap.metodos2;

import javax.swing.JOptionPane;

public class Exemplo3 {

	public static void main(String[] args) {
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado"));
		int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado"));
		
		//String resposta = tipoTriangulo(lado1, lado2, lado3);
		 
		JOptionPane.showMessageDialog(null, tipoTriangulo(lado1, lado2, lado3));
	}
	
	public static String tipoTriangulo (int lado1, int lado2, int lado3) {
		
		String resposta = "";
		
		if (lado1 + lado2 < lado3 || lado3 + lado2 < lado1 || lado1 + lado3 < lado2) {
			resposta = "Este não é um triângulo";
		} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			resposta = "Este é um triângulo escaleno";
		} else if (lado1 == lado2 && lado2 == lado3) {
			resposta = "Este é um triângulo equilátero";
		} else {
			resposta = "Este é um triângulo isósceles";
		}
		
		return resposta;
	}

}
