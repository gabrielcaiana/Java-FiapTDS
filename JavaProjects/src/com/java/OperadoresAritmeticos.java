package com.java;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		
		int soma = x + 2;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int resto = x % y;
		
		System.out.println("O resultado � " + soma);
		System.out.println("O resultado � " + subtracao);
		System.out.println("O resultado � " + multiplicacao);
		System.out.println("O resultado � " + resto);
		
		x++;
		System.out.println("O resultado do incremento � " + x);
		
		y--;
		System.out.println("O resultado do decremento � " + y);
		
		x += 10;
		System.out.println("O resultado da atribui��o aditiva � " +  x);
		
		y -= 10;
		System.out.println("O resultado da atribui��o subtrativa � " + y);
		

	}

}
