package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {

		//vetorA com 10 inteiros
		//soma de todos os valores
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int[10];
		int soma = 0;
		int i = 0;
		
		for (i =0; i<vetorA.length; i++) {
			System.out.println("Digite um valor");
			vetorA[i] = scan.nextInt();
			
			soma += vetorA[i];
		}
		
		System.out.print("Os valores do vetorA são ");
		for(i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("A soma dos valores do vetorA é: " + soma);
	
	}

}
