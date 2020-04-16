package com.loiane.cursojava.licaodecasa19;
import java.util.Scanner;
public class ex33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		//vetorA 10 elementos
		//definir quais são os primos e quais não são
		
		
		int [] vetorA = new int [10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um valor para o vetorA, posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		boolean primo;
		String msg;
				
		for (int i =0; i<vetorA.length; i++) {
			
			primo = true;
			for (int j=2; j<vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}
			
			msg = "";
			if (primo) {
				msg = " é primo";
			}else {
				msg = " não é primo";
			}	
			
		System.out.println(vetorA[i] + msg);

		}
	}
}
