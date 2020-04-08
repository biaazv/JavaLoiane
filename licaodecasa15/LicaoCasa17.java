package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Indique um ano");
		int ano = scan.nextInt();

		if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}

	}
}
