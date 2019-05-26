package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para instanciar e trabalhar com circulos escalaveis
//----------------------------------------------------------------------------------------------------------------

public class CirculoEscalavel implements ObjetoGeometrico, Escalavel{
	private Ponto2D centro;
	private double raio;
	
	//Metodos construtores
	public CirculoEscalavel(Ponto2D _centro, double _raio) {
		this.centro = _centro; 
		this.raio = _raio; 
	}
	
	public Ponto2D centro() {
		 return this.centro;
	}
	
	//Metodo para calcular a area da interface ObjetoGeometrico
	public double calculaArea() {
		 return Math.PI*raio*raio;
	}
	
	//Metodo para calcular o perimetro da interface ObjetoGeometrico
	public double calculaPerimetro() {
		return 2.0*Math.PI*this.raio;
	}
	
	//Metodo da interface Escalavel que amplica a escala de um objeto
	public void amplia(double _escala) {
		this.raio *= _escala;
	}
	
	//Metodo da interface Escalavel que espelha o objeto
	public void espelha() {
		try {
			this.centro = new Ponto2D(this.centro.getX()*(-1), this.centro.getY());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Metodo que clona o objeto
	public ObjetoGeometrico clona() {
		CirculoEscalavel clone = new CirculoEscalavel(this.centro, this.raio);
		return clone;
	}
	
	//Metodo toString
	public String toString() {
		
		// Retorna diretamente uma string criada com os valores dos campos. O método
		// toString da classe Ponto2D é chamado implicitamente.
		return centro + "-" + this.raio;
	}
}


