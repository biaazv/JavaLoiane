package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa23 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		//tipo de carne
		//qts de carne
		//preço total
		//tipo de pagamento
		//valor do desconto
		//valor a pagar
		
		System.out.println("Qual tipo de carne desejado? F - file duplo, A - alcatra ou P - picanha");
		String tipo = scan.next();
		
		System.out.println("Quantos quilos de carne?");
		int qtsCarne = scan.nextInt();
		
		double precoCarne = 0;
		
		if (tipo.equalsIgnoreCase("f")) {
			if (qtsCarne < 5) {
				precoCarne = 4.9;
			} else {
				precoCarne = 5.8;
			}
		}
		
		if (tipo.equalsIgnoreCase("a")) {
			if (qtsCarne < 5) {
				precoCarne = 5.9;
			} else {
				precoCarne = 6.8;
			}
		}
		
		if (tipo.equalsIgnoreCase("p")) {
			if (qtsCarne < 5) {
				precoCarne = 6.9;
			} else {
				precoCarne = 7.8;
			}
		}
		
		double total = qtsCarne * precoCarne; 
		
		System.out.println("Qual tipo de pagamento? D - dinheiro ou C - cartão");
		String pagamento = scan.next();
		
		
		if (pagamento.equalsIgnoreCase("C")) {
			 double desconto = 0.05;
			 double totalPagar = total - (total * desconto);
			System.out.println("O total é : " + total);
			System.out.println("O total a pagar é: " + totalPagar);
		} else {
			System.out.println("O total a pagar é " + total);
		
		}
		
		
		
		
		
	}
}


