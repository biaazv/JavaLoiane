package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//pedir a quantidade de numeros
		//fibonacci = 

		System.out.println("Digite o n-esimo número");
		int n = scan.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		int prox;
		
		System.out.println("A sequência de Fibonacci é: ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		for(int i = 3; i <=n; i++) {
			prox = num1 + num2;
			num1 = num2;
			num2 = prox;

			System.out.print(prox + " ");	
			
			
		}
	}
}
