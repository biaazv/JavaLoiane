package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//pedir 2 n�meros
		//n�o usar a fun��o de pot�ncia
	
	
		System.out.println("Digite a base");
		int base = scan.nextInt();
		
		System.out.println("Digite a potencia");
		int potencia = scan.nextInt();
		
		//2� = 2*2*2 = 8
		
		int resultado = base;
		for (int i = 1; i < potencia; i++) {
			resultado  *=base;
			
		}
		
		System.out.println(resultado);
		
	}
		

}
