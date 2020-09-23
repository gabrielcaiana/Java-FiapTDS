package com.java.leituradados;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Qual é a sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Seu peso é: " + peso + " e sua altura é: " + altura);
		
		double calcular = peso / (altura * altura);
		
		double imc = calcular;
		
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
		decimalFormat.setRoundingMode(RoundingMode.DOWN);
		
		System.out.println("Seu IMC é: " + decimalFormat.format(imc));
		
		if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Normal)");
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		}else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obeso I");
		}else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obeso II");
		}else if (imc >= 40) {
			System.out.println("Obeso III");
		}else {
			System.out.println("Baixo peso");
		}
		sc.close();
	}

}
