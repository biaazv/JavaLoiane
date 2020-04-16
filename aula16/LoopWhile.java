package com.loiane.cursojava.aula16;

public class LoopWhile {
	public static void main (String[] args) {
		
		int i = 0;
		int max = 10;
		
		System.out.println("Contando at� " + max);
		
		//avaliar a express�o e dps executar o c�digo
		while(i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		System.out.println(i);
		
		//executa o c�digo e dps avalia a express�o 
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
	}

}
