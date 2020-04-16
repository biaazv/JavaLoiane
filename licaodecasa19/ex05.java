package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		
		//vetorA com 10 inteiros
		//vetorB mesmo tipo e tamanho
		//vetorB = elemento de A * sua posição
		//vetorB = vetorA[] * i
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		
		for(int i = 0;i <10; i++) {
			System.out.println("Digite um valor para a posição " + (i+1));
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * i;
		}
		
		for(int i = 0; i< vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		for(int i = 0; i< vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
