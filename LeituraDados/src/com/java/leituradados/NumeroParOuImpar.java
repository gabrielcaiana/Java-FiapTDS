package com.java.leituradados;

import java.util.Scanner;

public class NumeroParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("O resultado da soma dos n�meros �: " + soma);
		
		int resto = soma % 2;
		
		if(resto == 0) {
			System.out.println("A soma � par");
		}else {
			System.out.println("A soma � �mpar");
		}
		sc.close();
	}

}
