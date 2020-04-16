package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {

		//vetorA 10 inteiros
		//determinar os multiplos de 5 
		//a soma desses multiplos
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		
		int i = 0;
		
		for (i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		System.out.print("Os multiplos de 5 são: ");
		for(i = 0; i< vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
				
				System.out.print(vetorA[i] + " ");
			}
		}
		
		
		System.out.println(" ");
		System.out.println("A soma é " + soma);
		
	}
}
