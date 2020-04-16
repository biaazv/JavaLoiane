package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {

		//vetorA 10ninteiros;
		//if else para pares e impares
		//percentual de pares e de ímpares
		
		Scanner scan = new Scanner(System.in);
	
		int [] vetorA = new int [10];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Digite um valor");
			vetorA[i] = scan.nextInt();
		}
		
		int par = 0;
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] %2 == 0) {
				par++;
			} 	
		}
		
		int impar = vetorA.length - par;
		
		//com divisão é legal usar o double
		double porcentagemPar = (par *100)/vetorA.length;
		double porcentagemImpar = 100 - porcentagemPar;
		
		System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
		System.out.println("Porcentagem Pares: " + porcentagemPar);
        System.out.println("Porcentagem Ímpares: " + porcentagemImpar);
	
	}

}
