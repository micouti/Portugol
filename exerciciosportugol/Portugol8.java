package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Portugol8 {

	public static void main(String[] args) {
		double v, imp, dist, custo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica desse carro: ");
		v = ler.nextDouble();
		
		imp = v + (v * 45) / 100;
		dist = v + (v * 28) / 100;
		
		custo = v + (imp + dist);
		
		System.out.println("O custo ao consumidor desse carro é de " + custo + "reais.");
		
	ler.close();
	}

}
