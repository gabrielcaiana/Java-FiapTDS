package com.java;

public class TesteConta3 {

	public static void main(String[] args) {
		Conta2 cc = new Conta2();
		cc.setNumero(10);
		cc.setAgencia(02);
		cc.depositar(1000);
		
		cc.depositar(1000);
		cc.retirar(1500);
		
		System.out.println("cc: " + cc.getNumero() + " Agencia: " + cc.getAgencia() + " Saldo: " + cc.getSaldo());
		
		Conta2 poupanca = new Conta2(11, 03, 800);
		
		System.out.println("Conta Poupança:" + poupanca.getNumero() + " Agencia: " + poupanca.getAgencia() + " Saldo: " + poupanca.getSaldo());
	}

}
