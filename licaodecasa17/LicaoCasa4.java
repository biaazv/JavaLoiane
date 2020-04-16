package com.loiane.cursojava.licaodecasa17;

public class LicaoCasa4 {

	public static void main(String[] args) {

		int popA = 80000;
		int popB = 200000;
		int ano = 0;
		
		
		while (popA < popB) {
			
			popA += popA * 3/100;
			popB += popB * 1.5/100;
			ano++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantos anos: " + ano);
		
				
			
				
	}

}
