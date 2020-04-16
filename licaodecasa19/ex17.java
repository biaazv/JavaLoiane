package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int [] idades = new int [10];
		
		for(int i=0; i<idades.length; i++) {
			System.out.println("Idade " + (i+1) + " de 10 pessoas.");
			idades[i] = scan.nextInt();
		}
		
		int qtdPessoas =0;
		for(int i=0; i<idades.length; i++) {
			if(idades[i] >35) {
				qtdPessoas++;
			}
			
			
		}
		System.out.println(qtdPessoas + " pessoas tem mais de 35 anos.");
	}

}
