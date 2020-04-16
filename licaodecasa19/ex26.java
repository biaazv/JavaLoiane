package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		int [] vetorC = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorA, posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorB, posição " + i);
			vetorB[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else if(vetorA[i] < vetorB[i]){
				vetorC[i] = -1;
			}
		}
		
		System.out.print("VetorA = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("VetorB = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.print("VetorC = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
