package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//número de mercadorias
		//0 para indicar fim da compra
		//preço de cada produto
		//total de comprar
		// dinheiro fornecido pelo cliente
		//calcular troco
		//volar ao inicio para registrar uma nova compra
		
		String output;
		double preco, valorPago, troco;
		double total = 0;
		boolean sair = false;
		
		
		do {
		System.out.println("Deseja realizar uma compra? S ou N");
		String comprar = scan.next();
		
		if (comprar.equalsIgnoreCase("s")){
			output = "Lojas Tabajara\n";
			
			System.out.println("Quantos produtos deseja comprar?");
			int qtsProdutos = scan.nextInt();
			
			for(int i = 1; i <= qtsProdutos; i++) {
				System.out.println("Informe o preço do produto " + i);
				preco = scan.nextDouble();
				total += preco;
				output += "Produto" + i + ": R$ " + preco + "\n";
			}
			
			output += "Total: " + total  + "\n";
			System.out.println("Total: " + total);
			
			
			System.out.println("Valor pago:");
			valorPago = scan.nextDouble();
			
			output += "Valor pago: " + valorPago + "\n";
			
			troco = valorPago - total;
			
			output += "Troco: " + troco + "\n";
			System.out.println(output);
		} else {
			sair = true;
		}
		} while (!sair);

		
		
		
			
		
		
		
	
	}
}
