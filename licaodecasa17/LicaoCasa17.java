package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa17 {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//pedir um numero
	//calcular o fatorial
	//ex: 5*4*3*2*1
	
	System.out.println("Digite um número para calcular o fatorial:");
	int num = scan.nextInt();
	
	int fatorial = 1;
	for (int i = num; i >  0; i--) {
		fatorial *= i;
		System.out.println(i);
	}
	
	System.out.println("Resultado: " + fatorial);
	
	}
}
