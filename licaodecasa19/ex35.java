package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		//vetorA 10 inteiros
		//imprimir cada elemento de A
		//imprimir os divisores do respectivo elemento
		
		
		//10 
		
		
		int [] vetorA = new int [10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorA, posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Analisando o número " + vetorA[i]);
			for(int j =1; j<vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + " é divisor");
				}
			}
			
			
			System.out.println();
		}
	
	
	}

}
