package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Qual a sua idade?");
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("� maior de idade");
		}else {
			System.out.println("� menor de idade");
		}*/
		
		//compra de um item
		
		System.out.println("Quanto custa o item?");
		int preco = scan.nextInt();
	
		if (preco <=10) {
			System.out.println("O pre�o est� �timo, pode comprar!");
		} else if (preco > 10 && preco <= 15) {
			System.out.println("Pe�a um desconto");
		} else if ( preco > 15 && preco < 17) {
			System.out.println("Melhor pesquisar");
		} else {
			System.out.println("N�o compre, t� bem caro, viu?");
		}
		
	}

}
