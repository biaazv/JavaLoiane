package com.loiane.cursojava.licaodecasa13;

import java.util.Scanner;

public class LicaoCasa {

	public static void main(String[] args) {
		//Licao 1
		//System.out.println("Olá Mundo");

		//Licao 2
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 System.out.println("Digite um número: ");
		
		int number = scan.nextInt();
		System.out.println("O número informado foi " + number);
		
		*/
		//Licao 3
		/*
		System.out.println("Digite dois números: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println("A soma dos dois números é: " + (number1 + number2)); 
		*/
	
		//Licao 4
		/*
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();

		System.out.println("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double nota4 = scan.nextDouble();
		
	
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("A sua média é: " + media);
		*/
		
		//Licao 5
		/*
		System.out.println("Quantos metros você quer converter para centímetros? ");
		double metros = scan.nextDouble();
		
		metros = metros * 100 ;
		
		System.out.println("São " + metros + " em centímetros");
		*/
		
		//Licao 6
		/*
		System.out.println("Qual o raio do círculo?");
		double raio = scan.nextInt();
		 
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é " + area);
		*/

		
		//Licao 7
		/*
		System.out.println("Qual o lado do quadrado?");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é " + area);
		System.out.println("O dobro da área do quadrado é " + (area * 2));
		*/
		
		//Licao 8
		
		/*
		System.out.println("Quanto você ganha por hora?");
		double valorHora = scan.nextInt();
		
		System.out.println("Quantas horas você trabalha por mês?");
		double horaTrabalhada = scan.nextInt();
		
		double salario = valorHora * horaTrabalhada;
		
		System.out.println("Seu salário é " + salario);
		*/
		
		//Licao 9
		/*
		System.out.println("Qual a temperatura em ºF?");
		double temperaturaF = scan.nextInt();
		
		double temperaturaC = (5 * (temperaturaF - 32) / 9);
		
		System.out.println("A temperatura em Celsius é: " + temperaturaC);
		*/
		
		//Licao 10
		
		/*
		System.out.println("Qual a temperatura em ºC?");
		double temperaturaC = scan.nextInt();
		
		double temperaturaF = (temperaturaC * 9/5 ) + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + temperaturaF);
		*/
		
		//Licao 11
		
		/*
		System.out.println("Digite 2 números:");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println("Digite o próximo número");
		double number3 = scan.nextDouble();
		
		int a = (number1 * 2) * (number2 / 2);
		System.out.println(a);
		
		double b = ((number1 * 3) + number3);
		System.out.println(b);
		
		float c = Math.pow(number3, 3);
		System.out.println(c);
		
		*/
		
		//Licao 12
		/*
		System.out.println("Digite sua altura");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println(pesoIdeal);
		*/
		
		//Licao 13
		/*
		System.out.println("Quanto você ganha por hora?");
		double ganha = scan.nextInt();
		
		System.out.println("Quantas horas você trabalha por mês?");
		double hora = scan.nextInt();
		
		//salario bruto
		double salario = ganha * hora;

		//descontos
		double impostoRenda = salario * 0.11;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05; 
		
		//salario liquido
		double salarioLiquido = salario - (impostoRenda + inss + sindicato);

		
		
		System.out.println("O salário bruto é: " + salario);
		System.out.println("O valor do INSS é: " + inss);
		System.out.println("O valor do Sindicato é: " + sindicato);
		System.out.println("O salário líquido é: " + salarioLiquido);
		*/

		//Licao 14
		/*
		System.out.println("Qual o tamanho do arquivo em MB?");
		double tamanho = scan.nextDouble();
		
		System.out.println("Qual a velocidade do link em segundos?");
		double velocidade = scan.nextDouble();
		
		
		double tempoDownload = tamanho / velocidade;
		
		System.out.println("O tempo de download em minutos será :" + tempoDownload);
		*/


		
		
		
		
		
	}

}
