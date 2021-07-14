package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Portugol7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, a2, b2, c2, x, y;
		
		System.out.println("Primeira equanção!");
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		
		//parte 2
		System.out.println("Digite o valor de A2: ");
		a2 = ler.nextInt();
		
		System.out.println("Digite o valor de B2: ");
		b2 = ler.nextInt();
		
		System.out.println("Digite o valor de C2: ");
		c2 = ler.nextInt();
		
		//terceira parte
		
		System.out.println(a + "x + " + b + "y = " + c);
		System.out.println(a2 + "x + " + b2 + "y = " + c2);
		
		x = (c + b2) - (b + c2) / (a + b2) - (b + a2);
		y = (a + c2) - (c + a2) / (a + b2) - (b + a2);
		
		System.out.println("O valor de x é " + x);
		System.out.println("O valor de y é " + y);
		
		
		
	ler.close();	
	}

}
