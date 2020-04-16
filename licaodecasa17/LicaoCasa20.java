package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de idades");
		int idades = scan.nextInt();
		
		double soma = 0;
		int idade;
		
		for(int i = 0; i<idades; i++) {
			System.out.println("Digite a idade da pessoa" + (i+1));
			idade = scan.nextInt();
			soma +=idade;
		}
	
		double media = soma/idades;
		
		if (media >=0 && media <= 25) {
			System.out.println("jovem");
		} else if (media >= 26 && media <=60) {
			System.out.println("Adulta");
		} else {
			System.out.println("Idosa");
		}
	
	}

}
