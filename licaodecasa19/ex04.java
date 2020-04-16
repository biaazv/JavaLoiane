package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ex04 {

	public static void main(String[] args) {
		
		//vetorA com 15 inteiros
		//vetorB mesmo tamanho 
		//vetorB será a raiz quadrada do respectivo A
		//vetorB[i] = sqrt(A[i])
		
		
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [4];
		double [] vetorB = new double [vetorA.length];
		
		for (int i = 0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para a posição " + (i+1));
			vetorA[i] = scan.nextInt();
			
			//OBSERVAR COMO USA O SQRT
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println( " ");
		
		DecimalFormat df = new DecimalFormat("###.##");
		for(int i = 0; i<vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
			
		}
	}
}
