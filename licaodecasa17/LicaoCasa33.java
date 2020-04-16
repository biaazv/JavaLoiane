package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//pedir valor de n
		//i = 1, incrimentar 1
		//j = 1, incrementar 2
		//fracao i/j
		//somar as frações
		
		
		
		System.out.println("Digite o valor de n");
		int n = scan.nextInt();
		double soma = 0;
		
		for (int i = 1, j = 1; i <= n; i++, j+=2 ) {
			System.out.print(i+ "/" + j + " + ");
			
			soma += i/j;
		}
		System.out.println("\n Soma = " + soma);
	}

}
