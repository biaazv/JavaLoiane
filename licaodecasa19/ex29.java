package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		int [] vetorC = new int [vetorA.length * 2];
		
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorA, posi��o " + i);
			vetorA[i] = scan.nextInt();
			
			vetorC[i] = vetorA[i];
		}
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorB, posi��o " + i);
			vetorB[i] = scan.nextInt();
			
			vetorC[vetorA.length + i] = vetorB[i];
		}
		System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i=0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
        
	}

}
