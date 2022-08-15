package br.com.fiap.metodos2;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		String nome = "", tipoEstadia = "";
		int qtdDiaria = 0;
		float total = 0;
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		tipoEstadia = JOptionPane.showInputDialog("Digite o tipo de estadia (1, 2 ou 3)");
		qtdDiaria = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de diárias"));
		
		total = calculaDiaria(tipoEstadia, qtdDiaria, nome);
		modoPagamento(total, nome);
	}
	
	public static float calculaDiaria (String tipoEstadia, int qtdDiaria, String nome) {
		float valorTipoDiaria = 0;
		
		switch (tipoEstadia) {
		case "1":
			valorTipoDiaria = 380;
			break;
			
		case "2":
			valorTipoDiaria = 450;
			break;
			
		case "3":
			valorTipoDiaria = 560;
			break;
		}
		
		float total = valorTipoDiaria * qtdDiaria;
		
		JOptionPane.showMessageDialog(null, nome + ", o total dá: R$ " + total);
		
		return total;
	}
	
	public static void modoPagamento (float total, String nome) {
		float totalDesconto = 0;
		String opcao = JOptionPane.showInputDialog("Qual modo de pagamento? (V ou P)");
		if (opcao.equals("V")) {
			float desconto = total * 0.1F;
			totalDesconto = total - desconto;
		} else if (opcao.equals("P")) {
			totalDesconto = total;
		}
		
		JOptionPane.showMessageDialog(null, "O valor final da estadia de " + nome + ": R$ " + totalDesconto);
	}
}
