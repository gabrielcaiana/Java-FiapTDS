package com.java;

import java.io.Serializable;

/**
 * Classe que abstrai uma conta bancária
 * @author gabriel
 * @version 1.0
 */

public class Conta2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero;	
	private int agencia;
	private double saldo;
	
	
	public Conta2() {
		
	}
	
	public Conta2(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Acrecenta valor ao Saldo da Conta
	 * @param valor que será depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da Conta
	 * @param valor que será retirado
	 * @see depositar
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return valor do saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}
	
}
