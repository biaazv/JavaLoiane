package com.loiane.cursojava.aula18;
import java.util.Scanner;
public class BreakEContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int num = scan.nextInt();
		
		System.out.println("Digite o limite");
		int max = scan.nextInt();
		
		
		//break para quebrar o loop
		/*
		 for (int i = num; i<=max; i++) {
		 
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("o valor de i � " + i);
				break;
			}
		}
		*/
		
		//break com r�tulos - go to (n�o � uma boa pr�tica)
		//n�o � usado
		
		
		//continue
		
	}

}
