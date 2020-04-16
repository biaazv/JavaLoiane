package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		double qtdHora = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHora;
		
		double porcentagemIR = 0;
		if (salarioBruto > 2500) {
			porcentagemIR = 20/100; 
		} else if (salarioBruto <= 2500 && salarioBruto > 1500) {
			porcentagemIR = 10/100; 
		} else if (salarioBruto > 900 && salarioBruto <=1500) {
			porcentagemIR = 5/100; 
		} else if(salarioBruto <= 900){
			porcentagemIR = 0 ; 
		}
		
		double inss = 0.10 * salarioBruto;
		double ir = porcentagemIR * salarioBruto;
		double fgts = 0.11 * salarioBruto;
		double sindicato = 0.03 * salarioBruto;
		double descontos = inss + ir + sindicato;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHora + ")" + " : R$ " + salarioBruto);
		System.out.println("(-) IR"  + ": R$ " + ir);
		System.out.println("(-) INSS"  + " : R$ " + inss);
		System.out.println("(-) FGTS"  + " : R$ " + fgts);
		System.out.println("Total de Descontos" + " : R$ " + descontos);
		System.out.println("Salário Líquido: "  + " : R$ " + salarioLiquido);
	}
}
