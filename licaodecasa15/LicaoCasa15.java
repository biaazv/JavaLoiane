package com.loiane.cursojava.licaodecasa15;

import java.util.Scanner;

public class LicaoCasa15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado");
		int lado1 = scan.nextInt();
		
		System.out.println("Digite o segundo lado");
		int lado2 = scan.nextInt();
		
		System.out.println("Digite o terceiro lado");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) &&
                ((lado1 + lado3) > lado2) && 
                ((lado2 + lado3) > lado1)){
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Tri�ngulo Equil�tero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2){
                System.out.println("Tri�ngulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Tri�ngulo Is�celes");
            }
            
        } else {
            System.out.println("N�o forma um tri�ngulo");
        }
	}
}

	
