package exerciciosGitHub;

import java.util.Scanner;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 11/05/2019
//Objetivo: classe UsoConta para instanciar objetos e usar metodos da classe Conta.
//----------------------------------------------------------------------------------------------------------------

public class UsoConta {
	
	private static Scanner ler;
	public static void main(String[] args) {
		ler = new Scanner(System.in);
		try {			
			//Instanciando os dois objetos
			System.out.println("Entre com o nome 1: ");
			String nome1 = ler.nextLine();
			System.out.println("Entre com o nome 2: ");
			String nome2 = ler.nextLine();
			System.out.println("Entre com o saldo 1: ");
			double saldo1 = ler.nextDouble();
			System.out.println("Entre com o saldo 2: ");
			double saldo2 = ler.nextDouble();
			Conta c1 = new Conta(nome1, saldo1);
			Conta c2 = new Conta(nome2, saldo2);
			
			System.out.println("Qual conta voce deseja corrigir?");
			int escolha = ler.nextInt();
			
			System.out.println("Entre com a taxa de juros (%): ");
			double taxaJuros = ler.nextDouble();
			Conta.setTAXA_JUROS(taxaJuros); 
			
			if (escolha == 1) {
				c1.corrigeSaldo();
			}
			else {
				c2.corrigeSaldo();
			}
			//Imprimindo os objetos
			System.out.println(c1);
			System.out.println(c2);
		}
		catch (Exception e) {
			System.out.println("Erro");
			System.out.println(e.getMessage());
		}
		
	}

}
