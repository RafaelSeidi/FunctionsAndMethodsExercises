package br.com.fiap.metodos2;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		float n1 = entrada.nextFloat();
		System.out.println("Digite a nota 2: ");
		float n2 = entrada.nextFloat();
		
		entrada.close();
		
		boolean passou = verificaAprovacao(n1, n2);
		
		if (passou) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado :(");
		}
	}
	
	public static boolean verificaAprovacao (float nota1, float nota2){
		
		float media = 0;
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			return true;
		} else {
			return false;
		}
		
	}
}
