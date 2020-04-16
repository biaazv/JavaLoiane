package com.loiane.cursojava.licaodecasa17;


public class LicaoCasa23 {

	public static void main(String[] args) {

		// tabela de 1,99 indo de 1 até 50
		
		System.out.println("Lojas Quase Dois - Tabela de preços");
		
		int item = 1;
		double preco = 1.99;
		
		
		for (int i = item; i < 51; i++) {
			System.out.println(i + " = " + i * preco);
		}
		
	}

}
