package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa2 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		
		System.out.println("Digite um n�mero");
		int num3 = scan.nextInt();
		
		if (num3 >= 0) {
			System.out.println("O valor � positivo");
		} else if (num3 < 0) {
			System.out.println("O valor � negativo");
		}
		
		
	}

}
