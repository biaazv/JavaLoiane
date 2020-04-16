package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;

		
		if (media > 9 || media == 10) {
			System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " e sua média foi:" + media + ". Você foi aprovado com conceito A!");		
		} else if (media > 7.5 || media <= 9) {
			System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " e sua média foi:" + media + ". Você foi aprovado com conceito B!");		
		} else if (media > 6.0 || media <= 7.5) {
			System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " e sua média foi:" + media + ". Você foi aprovado com conceito C!");		
		} else if (media >= 6.0  || media < 4) {
			System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " e sua média foi:" + media + ". Você foi reprovado com conceito D!");		
		} else if (media >= 4 || media == 0) {
			System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + " e sua média foi:" + media + ". 6Você foi reprovado com conceito E!");		
		}
		
		
		
		/*Solução Loaine */
		/*
		 * Notas: ficou visualmente melhor e mais fácil de entender, as etapas tão separadas e claras, o meu if ficou com muita coisa e cansativo pra entender
		 * */
		
		
		
		/*
		  String conceito = "";
	        if (media >= 9 && media <= 10){
	        	conceito = "A";
	        } else if (media >= 7.5 && media < 9){
	        	conceito = "B";
	        } else if (media >= 6 && media < 7.5){
	        	conceito = "C";
	        } else if (media >= 4 && media < 6){
	        	conceito = "D";
	        } else if (media >= 0 && media < 4){
	        	conceito = "E";
	        } 
	        
	        System.out.println("Nota 1: " + nota1);
	        System.out.println("Nota 2: " + nota2);
	        System.out.println("Média: " + media);
	        System.out.println("Conceito: " + aproveitamento);
	        
	        
		Switch(conceito){
			case "A":
			case "B":
			case "C": System.out.println("Aprovado!!!"); break;
			case "D":
			case "E": System.out.println("Reprovado"); break;
		}
		*/
	}

}
