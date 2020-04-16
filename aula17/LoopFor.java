package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		//for normal
		// variavel; condi��o; atualiaza��o da variavel
		//ao decrementar, use o maior igual
		//ao incrementar, a preferencial � n�o usar o igual

		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		//for com mais de uma variavel 
		for(int i = 0, j = 10; i <= j  ; i++, j--) {
			System.out.println ("i �: " + i + ", j �: "+ j);
		}
		
		//for com partes ausentes (n�o � comum)
		int cont = 0;
		for (; cont < 10 ;) {	
			 System.out.println("valor de cont: " + cont);
			 cont+=2;
		}
		
		//loop infinito
		//apenas por curiosidade, o programa nuncaa para de rodar
		//for(;; );
		
		//loop sem corpo
		//para somar valores
		int soma = 0;
		for (int i = 0; i < 5; soma += i++);
		System.out.println("O valor da soma � " + soma);
		
		//loop melhorado - utilizado com arrays
	}

}
