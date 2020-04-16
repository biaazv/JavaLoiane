package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a v�tima? Escreva 'sim' ou 'n�o'");
			String telefone = scan.next();
		
		System.out.println("Esteve no local do crime? Escreva 'sim' ou 'n�o'");
			String local = scan.next();
		
		System.out.println("Mora perto da v�tima? Escreva 'sim' ou 'n�o'");
			String mora = scan.next();
			
		System.out.println("Devia para a v�tima? Escreva 'sim' ou 'n�o'");
			String devia = scan.next();
			
		System.out.println("J� trabalhou com a v�tima? Escreva 'sim' ou 'n�o'");
			String trabalhou = scan.next();
			
			int cont = 0;

			if (telefone.equalsIgnoreCase("sim")) {
				cont++;
			} 

			if (local.equalsIgnoreCase("sim")) {
				cont++;
			} 

			if (mora.equalsIgnoreCase("sim")) {
				cont++;
			} 

			if (devia.equalsIgnoreCase("sim")) {
				cont++;
			} 

			if (trabalhou.equalsIgnoreCase("sim")) {
				cont++;
			} 

			if (cont == 2) {
				System.out.println("Suspeita");
			} else if (cont == 3 || cont == 4) {
				System.out.println("C�mplice");
			} else if (cont == 5) {
				System.out.println("Assassino");
			} else {
				System.out.println("Inocente");
			}	
	
	}
}
