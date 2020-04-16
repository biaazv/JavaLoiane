package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;

public class LicaoCasa1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;
		
		do 
		{			
			System.out.println("Digite uma nota:");
			double nota = scan.nextDouble();
		
			if (nota >=0 && nota <=10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Nota inválida.");
			}
		} while(!notaValida); // o while precisa ser uma expressão booleana
		


	
	}

}
