package com.java;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		
		int soma = x + 2;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int resto = x % y;
		
		System.out.println("O resultado é " + soma);
		System.out.println("O resultado é " + subtracao);
		System.out.println("O resultado é " + multiplicacao);
		System.out.println("O resultado é " + resto);
		
		x++;
		System.out.println("O resultado do incremento é " + x);
		
		y--;
		System.out.println("O resultado do decremento é " + y);
		
		x += 10;
		System.out.println("O resultado da atribuição aditiva é " +  x);
		
		y -= 10;
		System.out.println("O resultado da atribuição subtrativa é " + y);
		

	}

}
