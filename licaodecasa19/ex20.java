package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex20 {

	public static void main(String[] args) {

		//cota��o do dolar em rela��o
		//array com 20 elementos
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a cota��o do dolar?");
		double cotacao = scan.nextDouble();
		
		double [] vetorA = new double [20];
		
		for (int i = 0; i< vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		for (int i = 0; i< vetorA.length; i++) {
			System.out.println("U$" + cotacao + " * "+ (i+1) + " = " + vetorA[i]);
			
		}
		
		
	}

}
