package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa8 {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		System.out.println("Diga o pre�o do 1� produto");
			double primeiro = scan.nextDouble();
			
		System.out.println("Diga o pre�o do 2� produto");
			double segundo = scan.nextDouble();
			
		System.out.println("Diga o pre�o do 3� produto");
			double terceiro = scan.nextDouble();
		
	
		if (primeiro <= segundo && primeiro <= terceiro) {
			System.out.println("Compre o primeiro produto");
		} else if (segundo <= primeiro && segundo <= terceiro) {
			System.out.println("Compre o segundo produto");
		} else if (terceiro <= primeiro && terceiro <= segundo) {
			System.out.println("Compre o terceiro produto"); 
		}
	}
}
