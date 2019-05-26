package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para instanciar e trabalhar com retangulos escalaveis, supondo que o retangulo eh paralelo a origem
//----------------------------------------------------------------------------------------------------------------------


public class RetanguloEscalavel implements ObjetoGeometrico, Escalavel{
	private Ponto2D superiorEsquerdo;
	private Ponto2D inferiorDireito;
	
	//Campos que contem a largura e altura do retangulo inserido
	double largura = inferiorDireito.distancia(superiorEsquerdo.getX(), inferiorDireito.getY());
	double altura = superiorEsquerdo.distancia(superiorEsquerdo.getX(), inferiorDireito.getY());
	
	//O centro com as coord. que sao a media dos lados
	private Ponto2D centro = new Ponto2D(largura/2, altura/2); 
	
	//Metodo construtor
	public RetanguloEscalavel(Ponto2D _superiorEsquerdo, Ponto2D _inferiorDireito) throws Exception {
		this.superiorEsquerdo = _superiorEsquerdo;
		this.inferiorDireito = _inferiorDireito;
	}
			
	//Metodo que retorna o centro
	public Ponto2D centro() {
		return this.centro;
	}
	
	//Metodo que retorna a area do retangulo
	public double calculaArea() {
		return this.largura * this.altura;
	}
	
	//Metodo que retorna o perimetro do retangulo
	public double calculaPerimetro() {
		return 2.0 * (this.altura + this.largura);
	}
	
	//Metodo que amplia a escala do objeto
	public void amplia(double _escala) {
		this.largura *= _escala;
		this.altura *= _escala;
	}
	
	//Metodo que espelha as coordenadas
	public void espelha() {
		try {
			this.superiorEsquerdo = new Ponto2D(this.superiorEsquerdo.getX()*(-1), this.superiorEsquerdo.getY());
			this.inferiorDireito = new Ponto2D(this.inferiorDireito.getX()*(-1), this.inferiorDireito.getY());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Metodo que clona o objeto
	public ObjetoGeometrico clona() {
		RetanguloEscalavel clone = new RetanguloEscalavel(this.superiorEsquerdo, this.inferiorDireito);
		return clone;
	}
	
	//Metodo toString
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append(this.centro);
		ret.append(" - ");
		ret.append(superiorEsquerdo.toString());
		ret.append(",");
		ret.append(inferiorDireito.toString());
		return ret.toString();
	}
}
