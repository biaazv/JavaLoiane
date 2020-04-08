package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite a primeira nota");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
	
		if (media == 10) {
			System.out.println("Arassou, aprovado com exito!");
		} else if (media >= 7) {
			System.out.println("Arrasou, você foi aprovado");
		} else {
			System.out.println("Você foi reprovado");
		}
	}

}
