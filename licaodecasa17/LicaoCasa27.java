package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa27 {

	public static void main(String[] args) {

		//pedir a quantidade de temperaturas
		//pedir o valor das temperaturas
		//indicar o menor valor
		//indicar o maior valor
		//indicar a média
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas são as temperaturas?");
		int qtsTemperaturas = scan.nextInt();
		
		double valorTemp;
		double soma = 0;
		double menorValor = Double.MAX_VALUE;
		double maiorValor = Double.MIN_VALUE;
				
		for (int i = 0; i < qtsTemperaturas; i++) {
			System.out.println("Digite o valor da temperatura");
			valorTemp = scan.nextDouble();
			
			soma += valorTemp;
		
			if (valorTemp < menorValor) {
				menorValor = valorTemp;
			} else {
				maiorValor = valorTemp;
			}
		
		}
		
		System.out.println("Menor temperatura: " + menorValor);
		System.out.println("Maior temperatura: " + maiorValor);
		System.out.println("Média: " + (soma/qtsTemperaturas));
		
		
	}

}
