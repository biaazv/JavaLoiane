package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        
    
		// ler o código dos itens pedidos
		//ler as quantidades desejadas
		//mostrar o valor a ser pago por item
		//informar o final do pedido
		
		
		double cod, qtd;
		boolean naoTerminar = true;
		String output = "";
		double total = 0;
		
		do {
		System.out.println("Digite a quantidade e o código do pedido"
				+ " 100 - cachorro quente;"
				+ " 101 - bauru simples;"
				+ " 102 - bauru com ovo;"
				+ " 103 - hambúrguer;"
				+ " 104 - cheeseburguer;"
				+ " 105 - refrigerante;"
				+ " 0 0 para sair.");
		
		cod = scan.nextDouble();
		qtd = scan.nextDouble();
			
			if (cod == 0 && qtd == 0) {
				naoTerminar = false;
				output += "Total a pagar = " + total;
			} else {
				
				if (cod == 100) {
					output += "Cachorro quente - 1,20 * " + qtd;
					output += " = " + (qtd * 1.2) + "\n";
					total += 1.2* qtd;
				} else if (cod == 101) {
					output += "Bauru simples - 1,30 * " + qtd;
					output += " = " + (qtd * 1.3) + "\n";
					total += 1.3* qtd;
				} else if (cod == 102) {
					output += "Bauru com ovo - 1,50 * " + qtd;
					output += " = " + (qtd * 1.5) + "\n";
					total += 1.5* qtd;
				} else if (cod == 103) {
					output += "Hambúrguer - 1,20 * " + qtd;
					output += " = " + (qtd * 1.2) + "\n";
					total += 1.2* qtd;
				}else if (cod == 104) {
					output += "Cheeserburguer - 1,30 * " + qtd;
					output += " = " + (qtd * 1.3) + "\n";
					total += 1.3* qtd;
				}else if (cod == 105) {
					output += "Refrigerante - 1,00 * " + qtd;
					output += " = " + (qtd * 1.0) + "\n";
					total += 1* qtd;
				}
			}
		
		
		
		
		} while (naoTerminar);
		
			System.out.println(output);
	}

}
