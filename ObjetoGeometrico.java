package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: interface que contem metodos comuns de objetos geometricos
//----------------------------------------------------------------------------------------------------------------

//Podemos ter tratamento de erros em interfaces?

public interface ObjetoGeometrico {
	
	Ponto2D centro(); //Retorna um objeto da classe Ponto2D que esta no centro do objeto geometrico
	
	double calculaArea(); //Retorna o valor da area do objeto geometrico
	
	double calculaPerimetro(); //Retorna o valor do perimetro do objeto geometrico
	
	ObjetoGeometrico clona(); //Clona o objeto em questao
}
