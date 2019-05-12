package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 10/05/2019
//Objetivo: classe na qual o insere um ponto e 100 outros sao gerados com valores aleatorios, imprimindo 
// as distancias euclidianas entre o ponto definido pelo usuario e os 100 aleatorios.
//----------------------------------------------------------------------------------------------------------------
//1) Os valores double so estao gerando valores aleatorios menores que 0...
//Abaixo, esta o teste de todos os metodos definidos na classe Ponto
/* 
	Ponto ponto1 = new Ponto(1,3);
	Ponto ponto2 = new Ponto("(1,2)");
	System.out.println(ponto1.toString());
	System.out.println(ponto2.toString());
	if (ponto1.equals(ponto2)) {
		System.out.println("Pontos iguais");
	}
	else {
		System.out.println("Pontos diferentes");
	}
	//Testando os metodos
	System.out.println("Distancia (euclidiana) - 1 x 2: " + ponto1.distanciaPontos(ponto2)); 
	System.out.println("Distancia - 1 x Origem: " + ponto1.distanciaDaOrigem());
	System.out.println("Distancia - 2 x Origem: " + ponto2.distanciaDaOrigem());
	System.out.println("Ponto 1 maior que Ponto 2? " + ponto1.compareTo(ponto2));
	
	Ponto pontoClone1 = Ponto.clonarPonto(ponto1);
	Ponto pontoSwap1 = Ponto.pontoSwap(ponto1);
	System.out.println("Ponto 1 clonado: " + pontoClone1);
	System.out.println("Ponto 1 trocado: " + pontoSwap1); 
*/

import java.util.Scanner;
import java.util.Random;

public class UsoPonto {
	
	private static Scanner ler;
	public static void main(String[] args) {
		try {
			ler = new Scanner(System.in);
			Random gerador = new Random();
			int i;
			
			//O usuario entra com o ponto
			System.out.println("*** ENTRE COM O SEU PONTO ***");
			System.out.println("Entre com x: ");
			double xAux = ler.nextDouble();
			System.out.println("Entre com o y: ");
			double yAux = ler.nextDouble();
			Ponto pontoUser = new Ponto(xAux, yAux);
			System.out.println(pontoUser.toString());
			
			Ponto pontoRandom = new Ponto(); //Criando o ponto aleatorio
			
			//Loop para criar um ponto com valores aleatorios
			for (i = 0; i < 3; i++) {
				//Gera x e y aleatoriamente
				pontoRandom.setX(gerador.nextDouble());
				pontoRandom.setY(gerador.nextDouble());
				System.out.println(pontoRandom.toString()); //Imprime o ponto aleatorio
				System.out.println("Distancia (euclidiana) - 1 x " + (i + 1) + " :" + pontoUser.distanciaPontos(pontoRandom));
			}		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}