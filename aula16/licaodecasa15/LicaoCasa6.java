package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3){
			System.out.println(num1 + " � o maior que " + num2 + " e " + num3);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " � o maior que " + num1 + " e " + num3);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println(num3 + " � o maior que " + num1 + " e " + num2);
		}
	}

}
