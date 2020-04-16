package com.loiane.cursojava.licaodecasa17;

import java.util.Scanner;
public class LicaoCasa8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		//pedir 5 numero
		//somar todos os numeros
		//media de todos
		
		int num;
		int soma = 0;
		double media;
		for(int i = 0; i <5; i++) {
			System.out.println("Digite um valor:");
			num = scan.nextInt();
			
			soma += num;
		}
		
		media = soma /5;
		
		System.out.println("Soma " + soma);
		System.out.println("Média " + media);
		
	}

}
