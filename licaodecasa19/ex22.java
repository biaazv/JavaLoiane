package com.loiane.cursojava.licaodecasa19;

public class ex22 {

	public static void main(String[] args) {

		//vetorA com 10 inteiros
		//elementos devem ser 0 ou 1, usar o math.random
		//percentual de 0 e 1
		
		int [] vetorA = new int [10];
		
		int qtd0 = 0;
		int qtd1 = 0;
		

		System.out.println("Os algarismos são ");
		for(int i=0; i<vetorA.length; i++) {
			
			vetorA[i] = (int) Math.round(Math.random() * 1);
			//math.random = para gerar um num aleatório de 0 a 1
			//math round = para arredondar 
			//(int) para converter para inteiro
			
			
			if(vetorA[i] == 0) {
				qtd0++;
			} else {
				qtd1++;
			}
		
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("São 0: " + (100*qtd0) /vetorA.length + "%");
		System.out.println("São 1: " + (100*qtd1) /vetorA.length + "%");
	}

}
