package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite um n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Digite uma opera��o: +, -,*,/");
		String operacao = scan.next();
		
		double resultado = 0;
		
		switch (operacao) {
		case "+" : resultado = num1 + num2; break;
		case "-" : resultado = num1 - num2; break;
		case "*" : resultado = num1 * num2; break;
		case "/" : resultado = num1 / num2; break;
		default: System.out.println("Opera��o inv�lida");
		}
		
		boolean resultadoPar = resultado % 2 == 0;
		boolean resultadoPositivo = resultado > 0;
		
		
		if (resultadoPar && resultadoPositivo) {
			System.out.println(resultado + " � par e positivo");
		} else if (!resultadoPar && resultadoPositivo) {
			System.out.println(resultado + " � �mpar e positivo");
		} else if (resultadoPar && !resultadoPositivo) {
			System.out.println(resultado + " � par e negativo");
		} else if (!resultadoPar && !resultadoPositivo) {
			System.out.println(resultado + " � �mpar e negativo");
		}
		
		
		
		/*SOLU��O DA LOIANE 
		 
		boolean valida = true;
        
        switch(operacao){
            case "+": resultado = num1 + num2; break; 
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default: 
                System.out.println("Opera��o inv�lida"); 
                valida = false;
        }
        
        if (valida){
            
            System.out.println("Resultado: " + resultado);
            
            if (resultado >=0){
                System.out.println("resultado positivo");
            } else {
                System.out.println("resultado negativo");
            }
            
            if (resultado % 2 == 0){
                System.out.println("resultado par");
            }else {
                System.out.println("resultado �mpar");
            }
            
            */
        }
		
	}


