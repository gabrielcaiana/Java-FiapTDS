package com.java.leituradados;

import java.util.Scanner;

public class LeituraPeso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu peso");
		float peso = sc.nextFloat();
		System.out.println("O seu peso é " + peso);
		sc.close();

	}

}
