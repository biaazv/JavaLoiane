package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa30 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		//pedir ao usuário um número para a tabuada
		//pedir o valor inicial
		//pedir o valor final
		//verificar se o final é menor que o inicial
		
		System.out.println("Digite a tabuada desejada");
		int tabuada = scan.nextInt();
		
		boolean valores = false;
		int inicio, fim;
		
		do {
			System.out.println("Digite o valor inicial");
			inicio = scan.nextInt();
			
			System.out.println("Digite o valor final");
			fim = scan.nextInt();
			
			if (inicio > fim) {
				valores = false;
			}
			
			if (inicio < fim) {
				valores = true;
			}
			
			} while (!valores);
			
		
	
		System.out.println("A tabuada de: " + tabuada + " começando por " + inicio + " e terminando por " + fim);
		
		int resultado = 0;
		for (int i = inicio; i <= fim; i++) {
			resultado = tabuada * i;
			System.out.println(tabuada + " * " + i + " = " + resultado);
		}

		
	}	
	
}


