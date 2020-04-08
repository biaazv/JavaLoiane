package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa21{
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o combustível desejado? A - Alcool ou G - Gasolina");
		String tipo = scan.next();

		System.out.println("Quantos litros deseja?");
		int litros = scan.nextInt();
		
		double gasolina = 2.5;
		double alcool = 1.9;
		double total = 0;		
		int percDesconto = 0;
		double totalDesconto = 0;
		double precoPagar = 0;
		
		if (tipo.equalsIgnoreCase("a")) {
			if (litros <= 20) {
				percDesconto = 3;
			} else {
				percDesconto = 5;
			}
			
			total = litros * alcool;
			
		} else if (tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				percDesconto = 4;
			} else {
				percDesconto = 6;
			}
			
			total = litros * gasolina;
		}
		
		totalDesconto = (total/100) * percDesconto;
		
		precoPagar = total - totalDesconto;
		
		System.out.println(precoPagar);
	}
	
}