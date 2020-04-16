package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		//vetorA 5 inteiros
		//tabuada de cada um dos elementos do vetorA
		
		int [] vetorA = new int [5];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorA, posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println();
			System.out.println("Tabuada de " + vetorA[i]);
			for(int j=1; j<11; j++) {
				System.out.println(vetorA[i] + " * " + j + " = " + (vetorA[i]*j));	
			}
			
		}
		
	}

}
