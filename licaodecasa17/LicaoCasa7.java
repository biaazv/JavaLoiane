package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//pedir 5 numeros
		//analisar qual o maior
		//informar o maior


		int count = 0;
		int num;
		int maior = Integer.MIN_VALUE;
		
		do {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			count++;
			
			if (num > maior) {
				maior = num;
			}
		} while ( count < 5);
		
		System.out.println("O maior número é " + maior);
	}

}
