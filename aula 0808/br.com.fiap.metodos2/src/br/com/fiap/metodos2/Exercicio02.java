package br.com.fiap.metodos2;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {
		int codigo = 0;
		float cargaToneladas = 0;
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Estado de origem"));
		cargaToneladas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade da carga em toneladas"));
		
		float precoCarga = calculaPreco(cargaToneladas);
		
		JOptionPane.showMessageDialog(null, "O preço da carga do caminhão é: R$ " + precoCarga);
		
		float total = calculaImposto(codigo, precoCarga);
		JOptionPane.showMessageDialog(null, "O total a se pagar é de: R$ " + total);
	}
	
	public static float calculaPreco (float cargaToneladas) {
		float quilo = cargaToneladas * 1000;
		float precoQuilo = 0;
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da carga"));
		
		if (codigo >= 1 && codigo <= 10) {
			precoQuilo = 120;
		} else if (codigo >= 11 && codigo <= 20) {
			precoQuilo = 200;
		} else if (codigo >= 21 && codigo <= 30) {
			precoQuilo = 280;
		}
		
		float precoTotal = precoQuilo * quilo;
		
		return precoTotal;
	}
	
	public static float calculaImposto (int codigo, float precoCarga) {
		float imposto = 0;
		
		if (codigo == 1) {
			imposto = 0.25F;
		} else if (codigo == 2) {
			imposto = 0.20F;
		} else if (codigo == 3) {
			imposto = 0.15F;
		} else if (codigo == 4) {
			imposto = 0;
		}
		
		float valorImposto = 0;
		float aumentoImposto = 0;
		
		if (codigo != 4) {
			aumentoImposto = precoCarga * imposto;
			valorImposto = precoCarga + aumentoImposto;
		} else {
			valorImposto = precoCarga;
		}
		
		JOptionPane.showMessageDialog(null, "O valor do imposto a pagar é de: R$ " + aumentoImposto);
		
		return valorImposto;
	}
}
