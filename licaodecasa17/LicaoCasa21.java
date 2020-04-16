package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;
public class LicaoCasa21 {

	public static void main(String[] args) {

		//numero médio de alunos por turma
		//pedir qts turma
		//pedir quantidade de alunos por cada turma
		//turma não pode ter mais de 40 alunos
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o número de turmas?");
		int numTurmas = scan.nextInt();
		
		
		int numAlunos;
		int soma = 0;
		boolean invalido = true;
		
		for(int i = 0; i <numTurmas; i++) {
			
			invalido = true;
			do {
				System.out.println("Entre com o número de alunos da turma " + (i+1));
				numAlunos = scan.nextInt();
				
				if (numAlunos <=40) {
					invalido = false;
				} else {
					System.out.println("Número de aluno inválido, digite novamente: ");
				}
				
			} while(invalido);
			
		soma += numAlunos;
		
		}
			double media = soma / numTurmas;
			System.out.println(media);
	}
}
	


