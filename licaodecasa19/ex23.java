package com.loiane.cursojava.licaodecasa19;

import java.util.Scanner;
public class ex23 {

	public static void main(String[] args) {

		//vetorA com 10 inteiros
		//ver se todos s�o pares
		//se 1 n�o for par parar o processo
		
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
