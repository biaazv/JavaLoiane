package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F para feminino e M para masculino");
		String genero = scan.next();
		
		if (genero.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if(genero.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo inválido");
		}
				
	}

}
