package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//pedir um numero
		//primo
		//divisil s� por 1 e ele mesmo
		
		System.out.println("Digite um n�mero:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				System.out.println("N�o � um n�mero primo, divis�vel por " + i);
				//break;
			}

		}

		if (primo) {
			System.out.println("� um n�mero primo");
		}

	}
}
