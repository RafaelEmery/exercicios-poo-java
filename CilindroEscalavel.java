package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para instanciar e trabalhar com cilindros escalaveis
//----------------------------------------------------------------------------------------------------------------

//Duvida sobre o centro do cilindro!

public class CilindroEscalavel implements ObjetoTridimensional, Escalavel {
	private Ponto3D centro;
	private double altura;
	private double raioBase;
	
	//Metodo construtor
	public CilindroEscalavel(Ponto3D _centro, double _altura, double _raioBase) {
		this.centro = _centro;
		this.altura = _altura;
		this.raioBase = _raioBase;
	}
	
	//Metodo que retorna o centro do cilindro
	public Ponto3D centro() {
		return this.centro;
	}
	
	//Metodo que calcula a area de superficie do cilindo
	public double calculaSuperficie() {
		double areaBase = Math.PI*raioBase*raioBase;
		double areaTronco = (2*Math.PI*raioBase) * altura;
		return 2*areaBase + areaTronco;
	}
	
	//Metodo que calcula o volume do cilindro
	public double calculaVolume() {
		double areaBase = Math.PI*raioBase*raioBase;
		return areaBase * altura;
	}
	
	//Metodo que altera o tamanho do cilindro
	public void amplia(double _escala ) {
		this.raioBase *= _escala;
		this.altura *= _escala;
	}
	
	//Metodo que espelha o cilindro
	public void espelha() {
		try {
			this.centro = new Ponto3D(this.centro.getX()*(-1), this.centro.getY(), this.centro.getZ());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Metodo toString
	public String toString() {
		return centro + " - " + this.raioBase;
	}
}
