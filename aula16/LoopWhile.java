package com.loiane.cursojava.aula16;

public class LoopWhile {
	public static void main (String[] args) {
		
		int i = 0;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		//avaliar a expressão e dps executar o código
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		System.out.println(i);
		
		//executa o código e dps avalia a expressão 
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
	}

}
