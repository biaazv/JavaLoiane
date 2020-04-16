package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex19 {

	public static void main(String[] args) {


		//vetores Nota1 e Nota2 com 10 tipo real (double)
		//média aritmética simples das notas informadas
		//média >= 7 aprovado
		//média < 7 reprovado
		
		
		Scanner scan = new Scanner(System.in);
		
		double [] notas1 = new double [10];
		double [] notas2 = new double [notas1.length];
		
		for(int i =0; i<notas1.length; i++) {
			
			System.out.println("Digite a Nota1 do aluno " + (i+1));
			notas1[i] = scan.nextDouble();
			
			System.out.println("Digite a Nota2 do aluno " + (i+1));
			notas2[i] = scan.nextDouble();
		
		}
		
		
		System.out.print("Notas 1 =  = " );
		for (int i = 0; i < notas1.length; i++) {
			System.out.print(notas1[i] + " ");
		}
		
		System.out.println();
	
		System.out.print("Notas 2 =  " );
		for (int i = 0; i < notas2.length; i++) {
			System.out.print(notas2[i] + " ");
		}
	
		
		System.out.println();
		for(int i =0; i<notas1.length; i++) {
			double media = notas1[i] + notas2[i] / 2;
			
			if(media >= 7) {
				System.out.println("Aluno " + (i+1) + " sua média: " +  media + ". Você foi aprovado.");
			} else {
				System.out.println("Aluno " + (i+1) + " sua média: " +  media + ". Você foi reprovado.");
			}
		}
		
		
		
		
	}
}
