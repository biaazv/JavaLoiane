package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {

		//vetorA com 10 inteiros
		//escrever a maior e a menor idade e suas respectivas posições
		
		
		Scanner scan = new Scanner(System.in);

		int [] idades = new int [10];
		
		int i = 0;
		for(i=0; i<idades.length; i++) {
			System.out.println("Digite a idade da pessoa " + i);
			idades[i] = scan.nextInt();
		}
		
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		int velho = 0;
		for(i=0; i<idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];	
				velho = i;
				
			}
		}
		int novo = 0;
		for(i=0; i<idades.length; i++) {
			if (idades[i] < menor) {
				menor = idades[i];	
				novo = i;
			}
		}
		
		
		System.out.println("A pessoa " + velho  +" tem a maior idade, que é " + maior);
		System.out.println("A pessoa " + novo +" tem a menor idade, que é " + menor);
	}

}
