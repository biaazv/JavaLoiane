package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;
public class LicaoCasa11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); {
			
			System.out.println("Qual seu sal�rio atual?");
			double salario = scan.nextDouble();
			
			double percentual = 0;
			
			if (salario < 280) {
				percentual = 0.2; 
				
			} else if (salario >= 280 && salario < 700) {
				percentual = 0.15; 
				
			} else if (salario >= 700 && salario < 1500) {
				percentual = 0.10;
				
			} else if (salario >= 1500) {
				percentual = 0.05; 
			}
			
			double valor = salario * percentual;
			double salario1 = salario + valor;
			
			System.out.println("Seu sal�rio atual �: " + salario);
			System.out.println("O percentual de aumento aplicado �: " + percentual);
			System.out.println("O valor do aumento �: " + valor);
			System.out.println("O Seu novo sal�rio �: " + salario1);
			}
		}
	}

