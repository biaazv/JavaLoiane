package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		//vetorA e vetorB com 10 elementos
		//vetorC = subtração de A por B
		//vetorC = vetorA[i] * vetorB[i]
		
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[10];
		int [] vetorB = new int[10];
		int [] vetorC = new int[10];
		
		
		for(int i = 0; i <10; i++) {
			System.out.println("Digite um valor para o vetorA para a posição " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i <10; i++) {
			System.out.println("Digite um valor para o vetorB para a posição " + (i+1));
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		for(int i = 0; i < 10; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println("");
		for(int i = 0; i < 10; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		
	}

}
