package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//informar quantos cds
		//informar o valor de cada cd
		//valor total investido numa cole��o de cds
		//valor m�dio de cada cd
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos cds possui:");
		int qtsCds = scan.nextInt();
		
		double precoCd = 0;
		double total = 0;
		double soma = 0;
		
		for(int i = 0; i <qtsCds; i++) {
			System.out.println("Qual o pre�o do cd " + (i+1) + " ?");
			precoCd = scan.nextDouble();
			
			soma += precoCd;
			
		}
		
		double medio = soma / qtsCds;
		System.out.println("O valor total � " + soma);
		System.out.println("O valor m�dio de cada cd �: " + medio);
		
		
	}

}
