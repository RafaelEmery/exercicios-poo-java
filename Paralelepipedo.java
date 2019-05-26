package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para instanciar e trabalhar com paralelepipedos
//----------------------------------------------------------------------------------------------------------------


public class Paralelepipedo implements ObjetoTridimensional {
	private Ponto3D opostoSuperior;
	private Ponto3D opostoInferior;
	private Ponto3D centro;
		
	//Trabalharemos com distancia entre pontos:
	//a = largura
	//b = profundidade
	//c = altura
	double a = Ponto3D.distancia(opostoInferior.getX(), opostoInferior.getY(), opostoInferior.getZ(), opostoSuperior.getX(), opostoInferior.getY(), opostoSuperior.getZ());
	double b = Ponto3D.distancia(opostoSuperior.getX(), opostoInferior.getY(), opostoSuperior.getZ(), opostoInferior.getX(), opostoInferior.getY(), opostoSuperior.getZ());
	double c = Ponto3D.distancia(opostoSuperior.getX(), opostoSuperior.getY(), opostoSuperior.getZ(), opostoInferior.getX(), opostoInferior.getY(), opostoSuperior.getZ());
	
	//Metodo construtor
	public Paralelepipedo(Ponto3D _opostoSuperior, Ponto3D _opostoInferior, Ponto3D _centro) {
		this.opostoSuperior = _opostoSuperior;
		this.opostoInferior = _opostoInferior;
		this.centro = _centro;
	}
	
	//Metodo que retorna o centro do paralelepipedo
	//return new Ponto3D(a/2,b/2,c/2) seria adequado, pois e a media os eixos
	//Porem acontecem erros que nao consigo resolver
	public Ponto3D centro() {
		return centro;
	}
	
	//Metodo que calcula a area de superficie
	public double calculaSuperficie() {
		return 2*(a*b + b*c + a*c);
	}
	
	//Metodo que calcula o volume
	public double calculaVolume() {
		return a*b*c;
	}
	
	//Metodo toString
	public String toString() {
		return centro + " - " + this.calculaVolume() + " - " + this.calculaSuperficie();
	}
	
	
}
