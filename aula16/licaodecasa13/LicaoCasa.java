package com.loiane.cursojava.licaodecasa13;

import java.util.Scanner;

public class LicaoCasa {

	public static void main(String[] args) {
		//Licao 1
		//System.out.println("Ol� Mundo");

		//Licao 2
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 System.out.println("Digite um n�mero: ");
		
		int number = scan.nextInt();
		System.out.println("O n�mero informado foi " + number);
		
		*/
		//Licao 3
		/*
		System.out.println("Digite dois n�meros: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println("A soma dos dois n�meros �: " + (number1 + number2)); 
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
		
		System.out.println("A sua m�dia �: " + media);
		*/
		
		//Licao 5
		/*
		System.out.println("Quantos metros voc� quer converter para cent�metros? ");
		double metros = scan.nextDouble();
		
		metros = metros * 100 ;
		
		System.out.println("S�o " + metros + " em cent�metros");
		*/
		
		//Licao 6
		/*
		System.out.println("Qual o raio do c�rculo?");
		double raio = scan.nextInt();
		 
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo � " + area);
		*/

		
		//Licao 7
		/*
		System.out.println("Qual o lado do quadrado?");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A �rea do quadrado � " + area);
		System.out.println("O dobro da �rea do quadrado � " + (area * 2));
		*/
		
		//Licao 8
		
		/*
		System.out.println("Quanto voc� ganha por hora?");
		double valorHora = scan.nextInt();
		
		System.out.println("Quantas horas voc� trabalha por m�s?");
		double horaTrabalhada = scan.nextInt();
		
		double salario = valorHora * horaTrabalhada;
		
		System.out.println("Seu sal�rio � " + salario);
		*/
		
		//Licao 9
		/*
		System.out.println("Qual a temperatura em �F?");
		double temperaturaF = scan.nextInt();
		
		double temperaturaC = (5 * (temperaturaF - 32) / 9);
		
		System.out.println("A temperatura em Celsius �: " + temperaturaC);
		*/
		
		//Licao 10
		
		/*
		System.out.println("Qual a temperatura em �C?");
		double temperaturaC = scan.nextInt();
		
		double temperaturaF = (temperaturaC * 9/5 ) + 32;
		
		System.out.println("A temperatura em Fahrenheit �: " + temperaturaF);
		*/
		
		//Licao 11
		
		/*
		System.out.println("Digite 2 n�meros:");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println("Digite o pr�ximo n�mero");
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
		System.out.println("Quanto voc� ganha por hora?");
		double ganha = scan.nextInt();
		
		System.out.println("Quantas horas voc� trabalha por m�s?");
		double hora = scan.nextInt();
		
		//salario bruto
		double salario = ganha * hora;

		//descontos
		double impostoRenda = salario * 0.11;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05; 
		
		//salario liquido
		double salarioLiquido = salario - (impostoRenda + inss + sindicato);

		
		
		System.out.println("O sal�rio bruto �: " + salario);
		System.out.println("O valor do INSS �: " + inss);
		System.out.println("O valor do Sindicato �: " + sindicato);
		System.out.println("O sal�rio l�quido �: " + salarioLiquido);
		*/

		//Licao 14
		/*
		System.out.println("Qual o tamanho do arquivo em MB?");
		double tamanho = scan.nextDouble();
		
		System.out.println("Qual a velocidade do link em segundos?");
		double velocidade = scan.nextDouble();
		
		
		double tempoDownload = tamanho / velocidade;
		
		System.out.println("O tempo de download em minutos ser� :" + tempoDownload);
		*/


		
		
		
		
		
	}

}
