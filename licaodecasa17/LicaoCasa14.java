package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//pedir 10 numeros
		//quantidade de pares
		//quantidade de impares
		int valor = 0;
		int qtsImpares = 0;
		int qtsPares = 0;
		
		for(int i = 0; i <10; i++) {
			System.out.println("Digite um valor");
			valor = scan.nextInt();
			
			if (valor % 2 == 0) {
				qtsPares++;
			} else {
				qtsImpares++;
			}
		}
		
		System.out.println("Pares: " + qtsPares);
		System.out.println("Ímpares: " + qtsImpares);
	}
}
