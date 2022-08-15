package br.com.fiap.metodos2;

import javax.swing.JOptionPane;

public class Exercicio03 {
	static String nomes[] = {"Gustavo", "Lucas", "Mateus", "Rafael"};
	static float salarios[] = {1000, 2000, 3000, 500};
	static int tempos[] = {1, 3, 4, 2};
	static int marcacao[] = {0, 0, 0, 0};
	
	
	public static void main(String[] args) {
		
		int aumentos[] = verificaAumento();
		relatorio(aumentos);
	}
	
	public static int[] verificaAumento() {
		for (int i = 0; i < 4; i++) {
			if (salarios[i] < 700 || tempos[i] > 3) {
				marcacao[i] = 1;
			}
		}
		return marcacao;
	}
	
	
	public static void relatorio(int[] aumentos) {
		for (int i = 0; i < 4; i++) {
			if (aumentos[i] == 1) {
				JOptionPane.showMessageDialog(null, nomes[i] + " recebe aumento!");
			} else {
				JOptionPane.showMessageDialog(null, nomes[i] + " não recebe aumento");
			}
		}
	}
	
}
