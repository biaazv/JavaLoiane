package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//pedir 2 numeros;
		//imprir o intervalo entre eles
	
		System.out.println("Digite o primeiro número");
		int primeiro = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		int segundo = scan.nextInt();
		
		int soma = 0;
		
		for (int i = primeiro; i <= segundo; i++) {
			soma += i;
		}
		
		
		System.out.println(soma);
	}
	
}
