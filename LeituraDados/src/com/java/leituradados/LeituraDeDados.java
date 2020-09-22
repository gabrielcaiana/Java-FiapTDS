package com.java.leituradados;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		int idade = 101;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade:");
		idade = sc.nextInt();

		if(idade >= 18 && idade < 70) {
			System.out.println("Maior de idade");
		}else if(idade >= 70) { 
			System.out.println("Idosa");
			if(idade >= 100) {
				System.out.println("Centenária");
			}
		}else {
			System.out.println("Menor de idade");
		}
		sc.close();
	}

}
