package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 12/05/2019
//Objetivo: classe UsoData2 para instanciar objetos e trabalhar com metodos da classe Data2
//----------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
//Definindo a classe para objetos
//Entre com uma Data2 via teclado
public class UsoData2 {
	
	private static Scanner ler;
	public static void main(String args[]) {
		ler = new Scanner(System.in); //Variavel para otimizar a entrada de dados
		Data2 dt = new Data2();
		int i = 0;
		int qntDias = 4;
		
		//Tentando ler a entrada de dados
		//Fazer um while e um contador que ira ate 3	
		while (i < 3) {
			try {
				 			
				System.out.println("1. Entre com o dia: ");
				int diaAux = ler.nextInt();
				System.out.println("1. Entre com o mes: ");
				int mesAux = ler.nextInt();
				System.out.println("1. Entre com o ano: ");
				int anoAux = ler.nextInt();
				dt = new Data2(diaAux, mesAux, anoAux);
				
				System.out.println(dt);
				break;					
			}
			//Caso ocorra erros na validacao da classe Data2, chega no catch 
			catch (Exception e) {
				System.out.println(e.getMessage());	
				dt = new Data2();
			}
			i++;
		}
		
		//Chamando a incrementacao da data escolhida pelos metodos sobrecarregados
		dt.incrementarUmData(); //Para um dia
		dt.incrementarUmData(qntDias); //Para + 4 dias
		System.out.println("Data incrementada: " + dt);
	}
}