package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//pedir popA e B
		//pedir taxa de crescimento
		//validar, >0 se não, digitar valor novamente
		//se sim, realizar a operação
		
		
		double popA, popB, taxaA, taxaB; //variaveis utilizadas
		boolean infoValida = false; //para validar informação
		
		
		
		/* PEDIR POPULAÇÃO DE A*/
		do {
			System.out.println("Digite a população de A:");
			popA = scan.nextDouble();
			
			if (popA > 0) {
				infoValida = true;
			} else {
				infoValida = false;
			}
		} while(!infoValida);
		
		/* PEDIR TAXA DE A*/
		
		infoValida = false;
		
		do {
			System.out.println("Digite a taxa de crescimento de A");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				infoValida = true;
			} else {
				infoValida = false;
			} 
		} while(!infoValida);
		
		
		/*PEDIR POPULÇAO B*/
		infoValida = false;
		
		do {
			System.out.println("Digite a população de B");
			popB = scan.nextDouble();
			
			if (popB > 0) {
				infoValida = true;
			}else {
				infoValida = false;
			}
		} while(!infoValida);
		
		
		/* PEDIR TAXA DE CRESCIMENTO DE B*/
		
		infoValida = false;
		
		do {
			System.out.println("Digite a taxa de crescimento de B");
			taxaB = scan.nextDouble();
			
			if (taxaB > 0) {
				infoValida = true;
			} else{
				System.out.println("Taxa de crescimento precisa ser mairo que 0");
			}
		} while (!infoValida);
		
		
		
		int cont = 0;
		while (popA < popB) {
			popA += (popA/100)*taxaA;
			popB += (popB/100)*taxaB;
			cont++;
		}
		
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Anos: " + cont);
	}

}
