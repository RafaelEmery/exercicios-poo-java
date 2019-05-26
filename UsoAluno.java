package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 12/05/2019
//Objetivo: classe para instanciar objetos da classe aluno
//----------------------------------------------------------------------------------------------------------------

public class UsoAluno {
	public static void main(String args[]) {
	Aluno x = new Aluno("ze",9,8,6);
	System.out.println(x);
	
	Aluno y; 
	y = new Aluno(); 	
	y.setNotas(8,10); 
	y.setNome("maria"); 
	System.out.println(y);
	
	Aluno.setLIMITE_MAX(100); //Modificando o limite max. da nota
	Aluno.ultrapassouLimite(1000); //Verificando se a nota ultrapassou o limite
	}
}

