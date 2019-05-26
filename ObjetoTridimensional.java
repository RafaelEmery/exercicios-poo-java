package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: interface que contem metodos comuns de objetos geometricos com tres dimensoes
//----------------------------------------------------------------------------------------------------------------

public interface ObjetoTridimensional {
	
	Ponto3D centro(); //Retorna o ponto3D que estaria no centro
	
	double calculaSuperficie(); //Retorna a area de superficie
	
	double calculaVolume(); //Retorna o volume do objeto
}
