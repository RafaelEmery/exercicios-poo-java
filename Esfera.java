package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para instanciar e trabalhar com esferas
//----------------------------------------------------------------------------------------------------------------


public class Esfera implements ObjetoTridimensional {
	private Ponto3D centro;
	private double r;
	
	//Metodo construtor
	public Esfera(Ponto3D _centro, double _r) {
		this.centro = _centro;
		this.r = _r;
	}
	
	//Metodo que retorna o centro da esfera
	public Ponto3D centro() {
		return this.centro;
	}
	
	//Metodo que calcula a area de superficie da esfera
	public double calculaSuperficie() {
		return (4*r*2);
	}
	
	//Metodo que calcula o volume da esfera
	public double calculaVolume() {
		return ((4/3) * Math.pow(r, 3));
	}
	
	//Metodo toString
	public String toString() {
		return centro + " - " + r;
	}
	
}
