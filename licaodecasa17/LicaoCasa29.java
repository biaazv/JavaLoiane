package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		//usuário digitar o valor
		//lista de números primos entre 1 e o valor digitado
		
		System.out.println("Digite um valor");
		int valor = scan.nextInt();
		
		boolean primo;
		for (int i = 1; i <= valor; i++) {
			primo = true;
			
			for(int j = 2; j<i; j++) {
				if (i %j == 0) {
					primo = false;
				}
			}
			
			if (primo) {
				System.out.println(i);
			}
			}
		
	}

}
