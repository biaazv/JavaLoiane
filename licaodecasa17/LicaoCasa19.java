package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
			//perguntar quantas são as notas
			//digitar as notas
			//somar as notas
			//dividir pelo total de notas
		
		
		System.out.println("São quantas avaliações?");
		int avaliacoes = scan.nextInt();
		
		double media;
		double soma = 0;
		for(int i = 0; i < avaliacoes; i++) {
			System.out.println("Digite a nota:");
			double nota = scan.nextInt();
			

			soma += nota;
		}
		
			media = soma/avaliacoes;
		
			System.out.println("A soma é " +soma);
			
			System.out.println("A média é " +media);
	
	
	
	
	
	}
}