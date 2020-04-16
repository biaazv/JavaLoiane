package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {

		//vetorA com 10 elementos
		//definir os impares
		//quantos são os impares
		//a média aritmética dos impares
		
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor");
			vetorA[i] = scan.nextInt();
		}
		
		int cont = 0;
		int soma = 0;
		System.out.print("Os ímpares são: ");
		for(int i=0; i<vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				cont++;
				soma += vetorA[i];
			
				System.out.print(vetorA[i] + " ");
			}
		}
		
		System.out.println(" ");
		System.out.println("A soma dos ímpares é: " + soma);
		System.out.println("A média dos ímpares é: " + (soma/cont));
		
	}
}
