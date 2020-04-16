package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos quilos de morangos?");
		int kgMorango = scan.nextInt();
		
		System.out.println("Quantos quilos de maça?");
		int kgMaca = scan.nextInt();
		
		double precoMorango = 0;
		if (kgMorango <=5) {
			precoMorango = 2.5;
		}else {
			precoMorango = 2.2;
		}
		
		double precoMaca = 0;
		if (kgMaca <= 5) {
			precoMaca = 1.8;
		} else {
			precoMaca = 1.5;
		}

		double totalMorango = kgMorango * precoMorango;
		double totalMaca = kgMaca * precoMaca;
		double total = totalMorango + totalMaca;
		
		double kgFrutas = kgMorango + kgMaca;
		double percDesconto = 0;
		if ((kgFrutas > 8) || (total < 25)) {
			percDesconto = 10;
		}
		
		double totalPagar = total - ((total/100) * percDesconto);
				
		System.out.println("Preço total morango " + totalMorango);
		System.out.println("Preço total maça " + totalMaca);
		System.out.println("Preço total cheio: " + total);
		System.out.println("Desconto: " + (total/100) * percDesconto);		
		System.out.println("Preço total com desconto: " + totalPagar);
		}

}
