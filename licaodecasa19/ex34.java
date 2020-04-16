package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		
		//vetorA 10 inteiros
		//relação de todos os pares 0 até o respectivo elemento
		
		int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = scan.nextInt();
        }
        
        for (int i =0; i< vetorA.length; i++) {
        	System.out.println("Analisando " + vetorA[i]);
        	
	        for(int j = 2; j<vetorA[i]; j++) {
	        	if (j % 2 == 0) {
	        		System.out.println(j + " é par");
	        	}
	        }
	        
	        System.out.println();
        }
	}

}
