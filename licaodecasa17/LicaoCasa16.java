package com.loiane.cursojava.licaodecasa17;

public class LicaoCasa16 {

	public static void main(String[] args) {

		
		int num1 = 1;
		int num2 = 1;
		int prox = 0;
		
		
		System.out.println("A sequência de Fibonacci é: ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		while(prox <= 500) {
			prox = num1 + num2;
			num1 = num2;
			num2 = prox;

			System.out.print(prox + " ");	
		}
			
		}

	}


