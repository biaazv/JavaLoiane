package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex24 {

	public static void main(String[] args) {
		//vetorA com 10inteiros
		//verificar se é um palíndromo (espelhado) 
		//primeiro = ultimo
		//segundo = penultimo
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		boolean palindromo = true;
		
		for(int i=0; i<(vetorA.length/2); i++) {
			
			if(vetorA[i] != vetorA[vetorA.length -1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.println("Vetor A = ");
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		if(palindromo) {
			System.out.println("Palindromo");
		}else {
			System.out.println("Não é palindromo");
		}
		
		
	}

}
