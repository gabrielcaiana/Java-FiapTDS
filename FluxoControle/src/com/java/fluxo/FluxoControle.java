package com.java.fluxo;

public class FluxoControle {
	public static void main(String[] args) {
		int idade = 85;

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
	}

}
