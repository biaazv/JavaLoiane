package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//pedir um numero
		//primo
		//divisil só por 1 e ele mesmo
		
		System.out.println("Digite um número:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				System.out.println("Não é um número primo, divisível por " + i);
				//break;
			}

		}

		if (primo) {
			System.out.println("É um número primo");
		}

	}
}
