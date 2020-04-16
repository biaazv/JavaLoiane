package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 +2;
		System.out.println(resultado);
		
		resultado = resultado -1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado/2;
		System.out.println(resultado);
		
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado %7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = "uma string concatenada";
		System.out.println(primeiroNome + segundoNome);
		
		
		resultado = resultado +1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		
		System.out.println(resultado++); //imprimir o valor do resultado e adicionar 1
		System.out.println(++resultado); //adicionando o valor e dps imprindo a string
		
		resultado--;
		System.out.println(resultado);
		
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
	}

}
