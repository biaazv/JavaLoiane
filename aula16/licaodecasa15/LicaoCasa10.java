package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); {
			
			System.out.println("Digite M para matutino, V para vespertino ou N para noturno");
			String turno = scan.next();
			
			switch (turno) {
			case "M":
			case "m": System.out.println("Bom dia!"); break;
			case "V":
			case "v": System.out.println("Boa tarde"); break;
			case "N":
			case "n": System.out.println("Boa noite"); break;
			default: System.out.println("Não é uma opção válida");
			}
			
		}
	}

}
