package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int num = scan.nextInt();
		
		if (num % 2 != 0) {
			System.out.println(num + " � �mpar");
		} else {
			System.out.println(num + " � par");
		}
	}

}
