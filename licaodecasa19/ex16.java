 package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//vetorA 10 inteiros
		//soma dos inteiros menores que 15
		//quantidade de elementos iguais a 15
		//a média dos superiores a 15
		
		
		int [] vetorA = new int [10];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para a posição " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		
		int cont = 0;
		int somaMaior15 =0;
		int somaMenor15 =0;
		int igual15 = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] == 15) {
				igual15++;
			} else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else {
				cont++;
				somaMaior15 += vetorA[i];
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Quantos números == 15: " + igual15);
		System.out.println("A soma dos <15: " + somaMenor15);
		System.out.println("A média dos > 15 é: " + (somaMaior15/cont));
		
	}

}
