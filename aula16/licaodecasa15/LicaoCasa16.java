package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de a:");
		int a = scan.nextInt();
		
		if (a ==0) {
			System.out.println("Não é uma equação de segundo grau");
		} else {
			
			System.out.println("Digite o valor de b:");
			int b = scan.nextInt();
			
			System.out.println("Digite o valor de c:");
			int c = scan.nextInt();
			
			int delta = (b * b) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("Delta negativo");
			
			} else if (delta > 0) {
				int raiz1 = ((-b) + delta) / 2*a;
				int raiz2 = ((-b) - delta) / 2*a;
				System.out.println("Os deltas são: " + raiz1 + " e " + raiz2);
				
			} else if (delta == 0){
				int raiz3 = (-b + delta) / 2*a;
				System.out.println("O delta é: " + raiz3);
			}
		}
		
		
	}

}
