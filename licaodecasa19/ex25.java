package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
	
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		for(int i=0; i<vetorA.length; i++) {

			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}else {
				vetorB[i] = 0;
			}
		}
		
		System.out.print("vetorA = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("vetorB = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}
}
