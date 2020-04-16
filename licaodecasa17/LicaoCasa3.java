package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;

public class LicaoCasa3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, genero, estadoCivil;
		double idade, salario;
		
		
		/* NOME */
		
		do {
			System.out.println("Digite seu nome");
			nome = scan.next();
		
			if(nome.length() <= 3) {
				infoValida = false;
				System.out.println("Por favor, digite novamente");
			}else {	
				infoValida = true;
			}
		} while (!infoValida);
	
		
		
		/*IDADE*/
		infoValida = false;
		do {
		System.out.println("Digite sua idade");
		idade = scan.nextDouble();
		
			if(0 <= idade && idade <= 150) {
				infoValida = true;
			}else {
				infoValida = false;
				System.out.println("Idade inválida, precisa ser entre 0  e 150");
				}
			} while (!infoValida);
		
		
		
		/* SALARIO*/
		
		infoValida = false;
		do {
			System.out.println("Digite seu salario");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				infoValida = true;
				System.out.println("Salário válido");
				
			} else {
				System.out.println("Salário inválido");
			}
			
		} while(!infoValida);
		
		
		
		
		/*GÊNERO*/
		infoValida = false;
		
		do {
			System.out.println("Digite seu genero, F ou M:");
			genero = scan.next();
			
			if (genero.equalsIgnoreCase("f") ||
				genero.equalsIgnoreCase("m")) {
				infoValida = true;
				System.out.println("Gênero válido");
			} else {
				System.out.println("Gênero inválido. Digite novamente:");
			}
			
			
			} while(!infoValida);
		
		
		
		
		/*ESTADO CIVIL*/
		
		
		infoValida = false;
		do {
			System.out.println("Digite seu estado civil");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") ||
				estadoCivil.equalsIgnoreCase("c") ||
				estadoCivil.equalsIgnoreCase("v") ||
				estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
				System.out.println("Estado Civil válido");
				
			} else {
				System.out.println("Estado Civil inválido.");
			}
		} while(!infoValida);
		
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu salário: " + salario );
		System.out.println("Seu gênero:" + genero);
		System.out.println("Seu estado civil: " + estadoCivil);
		
	}
	

}
