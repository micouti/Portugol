package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Pertugol4 {

	public static void main(String[] args) {
		int a, b, c, d, r, s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		a = ler.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		b = ler.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		c = ler.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		ler.close();
		System.out.println("Resposta: " + d);
	}
	
}
