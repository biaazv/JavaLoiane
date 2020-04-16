package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = scan.nextInt();
		
		boolean primo = true;
		for (int i = 2; i < valor; i++) {
			
			if (valor % i == 0) {
				primo = false;
				System.out.println("Não é primo, divisível por " + i);
			} 
			
		}
		
		if (primo) {
			System.out.println("É um número primo");
		}
		
	}

}
