package com.java;

public class Conta2 {
	
	//ATRIBUTOS
	int numero, agencia;
	double saldo;
	
	//CONTRUTORES
	public Conta2() {
		
	}
	
	public Conta2(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	//MÉTODOS
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public void retirar(double saldo) {
		this.saldo -= saldo;
	}
	
	public double verificarSaldo() {
		return saldo;
	}
	
}
