package com.loiane.cursojava.licaodecasa19;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		//vetorA e vetorB com 10 elementos
		//vetorC = subtração de A por B
		//vetorC = vetorA[i] / vetorB[i]
		
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[3];
		int [] vetorB = new int[vetorA.length];
		double [] vetorC = new double[vetorA.length];
		
		
		for(int i = 0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorA para a posição " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorB para a posição " + (i+1));
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		System.out.print("Vetor A = " );
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
	
		System.out.print("Vetor B = " );
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		

		System.out.print("Vetor C = " );
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

		
	}

}
