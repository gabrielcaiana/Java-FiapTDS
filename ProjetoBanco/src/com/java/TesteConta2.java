package com.java;

public class TesteConta2 {
	public static void main(String[] args) {
		Conta cc = new Conta(50.0); 
		
		//cc.setNumero(1000);
		//cc.depositar(500);
		
		System.out.println("O n�mero da conta �: " + cc.getNumero());
		System.out.println("O saldo da conta �: R$" + cc.recuperarSaldo());
	}
}
