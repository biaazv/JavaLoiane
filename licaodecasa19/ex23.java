package com.loiane.cursojava.licaodecasa19;

import java.util.Scanner;
public class ex23 {

	public static void main(String[] args) {

		//vetorA com 10 inteiros
		//ver se todos são pares
		//se 1 não for par parar o processo
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("digite um valor");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] %2 != 0) {
				break;
			}
		}
	}
}
