package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa {

	private static final String F = null;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int num2 = scan.nextInt();

		if (num1 > num2){
			System.out.println(num1);
		} else if (num1 < num2) {
			System.out.println(num2);
		} else {
			System.out.println("Os n�meros s�o iguais.");
		}
		
				
	}
}

