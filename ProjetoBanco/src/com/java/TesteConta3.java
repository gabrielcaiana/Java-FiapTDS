package com.java;

public class TesteConta3 {

	public static void main(String[] args) {
		Conta2 cc = new Conta2();
		cc.numero = 10;
		cc.agencia = 02;
		cc.saldo = 1000;
		
		cc.depositar(1000);
		cc.retirar(500);
		
		System.out.println("cc: " + cc.numero + " Agencia: " + cc.agencia + " Saldo: " + cc.saldo);
		
		Conta2 poupanca = new Conta2(11, 03, 600);
		
		System.out.println("Conta Poupança:" + poupanca.numero + " Agencia: " + poupanca.agencia + " Saldo: " + poupanca.saldo);
		
	}

}
