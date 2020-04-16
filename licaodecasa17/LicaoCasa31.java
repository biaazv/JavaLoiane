package com.loiane.cursojava.licaodecasa17;
import java.text.DecimalFormat;
import java.util.Scanner;
public class LicaoCasa31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double inicial = 0;
		double aumento = 1.5;
		
		//1996 - aumento de 1.5%
		//1997 (incluso) - aumento foi o dobro do ano anterior
		//sal�rio atual - 2020
		
		System.out.println("Digite o sal�rio inicial");
		inicial = scan.nextDouble();
		
		
		//sal�rio de 1996
		inicial += inicial * (aumento/100);
		
		//sal�rio de 1997
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1997;i<=2020 ;i++) {
			aumento *= 2;
			inicial += inicial * (aumento/100);
			
			System.out.println(i + " = " + format.format(inicial) + " - " + aumento + "%");
		}
	}

}
