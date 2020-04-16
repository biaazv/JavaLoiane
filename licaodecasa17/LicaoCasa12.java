package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa12 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//informar a tabuada entre 1 e 10
		//pedir tabuada desejada
		
		
		System.out.println("Informe a tabuada desejada:");
		int tabuada = scan.nextInt();
		
		System.out.println("A tabuada de " + tabuada + " ");
		
		for (int i = 1; i <11; i++) {
			System.out.println(tabuada + "*" + i +" = " + tabuada*i);
		}
	
	}
}
