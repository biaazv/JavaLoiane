package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		//vetorA 15 inteiros
		//vetorB fatorial do elemento em A
		
		int [] vetorA = new int [5];
		int [] vetorB = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorA, posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			vetorB[i] = 1;
			for(int j=vetorA[i]; j> 0; j--) {
				vetorB[i] *= j;
			}
			
		}
		
		System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
		
		
		
	
	}

}
