package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;

public class LicaoCasa26 {

	public static void main(String[] args) {
		//usu�rio fornece o n�mero
		//calcular o fatorial do n�mero fornecido
		//5*4*3*2*1
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o fatorial desejado:");
		int num = scan.nextInt();
		
		System.out.println("Fatorial de: " + num);
		
		int fatorial = 1;
		for (int i = num; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + " . ");
		}
		System.out.print(" 1 = " + fatorial);
		
		
	}

}
