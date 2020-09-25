package com.java;

public class TesteConta {
 public static void main(String[] args) {
	 
	 Conta contaCorrente = new Conta();
	 Conta contaPoupanca = new Conta();
	 Conta contaInvestimento = new Conta();
	 
	 contaCorrente.numero = 11;
	 contaCorrente.saldo = 20.5;
	 contaCorrente.cliente.nome = "Gabriel";
	 contaCorrente.cliente.idade = 23;
	 
	 contaPoupanca.numero = 22;
	 contaPoupanca.saldo = 30.0;
	 contaPoupanca.cliente.nome = "Gisely";
	 contaPoupanca.cliente.idade = 25;
	 
	 contaInvestimento.numero = 33;
	 contaInvestimento.saldo = 40.0;
	 contaInvestimento.cliente.nome = "Polly";
	 contaInvestimento.cliente.idade = 1;
	 
	 System.out.println(contaCorrente.numero);
	 System.out.println(contaCorrente.saldo);
	 System.out.println(contaCorrente.cliente.nome);
	 System.out.println(contaCorrente.cliente.idade);
	 
 }
}
