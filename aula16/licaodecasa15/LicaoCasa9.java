package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double primeiro = scan.nextDouble();

		System.out.println("Digite um número");
		double segundo = scan.nextDouble();
		
		System.out.println("Digite um número");
		double terceiro = scan.nextDouble();
		
		// primeiro maior
		if (primeiro > segundo && primeiro > terceiro && segundo > terceiro) {
			System.out.println(primeiro + " > " + segundo + " > " + terceiro);
		} else if (primeiro > segundo && primeiro > terceiro && segundo < terceiro) {
			System.out.println(primeiro + " > " + terceiro + " > " + segundo);
		}	
		
		//segundo maior
		
		 else if (primeiro < segundo && segundo > terceiro && primeiro > terceiro) {
			System.out.println(segundo + " > " + primeiro + " > " + terceiro);
		}  else if (primeiro < segundo && segundo > terceiro && primeiro < terceiro) {
			System.out.println(segundo + " > " + terceiro + " > " + primeiro);
		}
		
		//terceiro maior
		
		else if (terceiro > segundo && terceiro > primeiro && segundo > primeiro) {
			System.out.println(terceiro + " > " + segundo + " > " + primeiro);
		}  else if (terceiro > segundo && terceiro > primeiro && segundo < primeiro) {
			System.out.println(terceiro + " > " + primeiro + " > " + segundo);
		}
	}

}
