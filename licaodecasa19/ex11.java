package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {

		//vetorA = 10 elementos
		//definir e escrever os pares
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		
		
		for (int i =0; i <vetorA.length; i++) {
			System.out.println("digite um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		System.out.print("Vetor A = " );
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println(" ");
		
		int cont = 0;
		System.out.print("Os pares são = ");
		for(int i = 0; i< vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				cont++;
				System.out.print(vetorA[i] + " ");
			}
		}
		
		System.out.println(" ");
		System.out.println("Total de pares " + cont);	
	}
}
