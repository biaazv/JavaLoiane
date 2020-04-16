package com.loiane.cursojava.licaodecasa17;
import java.util.Scanner;

public class LicaoCasa2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//fazer a operação enquanto a informação for falsa, quando se tornar verdadeira, retornar o resultado;
		boolean verificar = false;
		String nome, senha;

		
		do {
		System.out.println("Digite o nome:");
		nome = scan.next();
	
		System.out.println("Digite a senha:");
		senha = scan.next();
	
		if(nome.equalsIgnoreCase(senha)) {
			verificar = false;
			System.out.println("Senha e usuário iguais. Digite novamente");
			
		} else {
			verificar = true;
			System.out.println("Senha e usuários válidos");
		}
		} while(!verificar);
	}
	

}
