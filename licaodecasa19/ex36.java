package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		//vetorA 11 elementos
		//potencia base 2 e expoente é a posição do elemento
		
		double [] vetorA = new double [11];
		
		for(int i=0; i<vetorA.length; i++) {

			vetorA[i] = Math.pow(2, i);
			
		}
		
		System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
		
		
	
	}

}
