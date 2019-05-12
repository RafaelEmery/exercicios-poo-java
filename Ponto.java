package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 10/05/2019
//Objetivo: classe Ponto com coordenadas para basicamente trabalhar com a matematica e logica.
//----------------------------------------------------------------------------------------------------------------
//1) Qual a diferenca de usar como parametro Ponto _ponto ou Object object (e depois fazer cast com aux)? Por que?

public class Ponto {
	private double x, y;
	@SuppressWarnings("unused")
	private String coordenadas;
	private int LIMITE_INFERIOR = 0, LIMITE_SUPERIOR = 500;
	
	//Metodos construtores 
	public Ponto() throws Exception {
		//Atribuindo o valor default
		this.setX(0);
		this.setY(0);
	}
	public Ponto(double _x, double _y) throws Exception {
		this.setX(_x);
		this.setY(_y);
	}
	public Ponto(String _coordenadas) throws Exception {
		this.setCoordenadas(_coordenadas);
	}
	
	//Metodos setter
	public void setX(double _x) throws Exception {
		if (_x >= this.getLIMITE_INFERIOR() && _x <= this.getLIMITE_SUPERIOR()) {
			this.x = _x;
		}
		else {
			throw new Exception("Invalido.");
		}
	}	
	public void setY(double _y) throws Exception {
		if (_y >= this.getLIMITE_INFERIOR() && _y <= this.getLIMITE_SUPERIOR()) {
			this.y = _y;
		}
		else {
			throw new Exception("Invalido.");
		}
	}
	public void setCoordenadas(String _coordenadas) throws Exception {
		int i;
		String xStr, yStr;
		
		i = _coordenadas.indexOf(",");
		xStr = _coordenadas.substring(1, i);
		yStr = _coordenadas.substring(i + 1, i + 2);
		this.setX(Double.parseDouble(xStr));
		this.setY(Double.parseDouble(yStr));
	}
	public void setLIMITE_INFERIOR(int _LIMITE_INFERIOR) throws Exception {
		this.LIMITE_INFERIOR = _LIMITE_INFERIOR;
	}
	public void setLIMITE_SUPERIOR(int _LIMITE_SUPERIOR) throws Exception {
		this.LIMITE_SUPERIOR = _LIMITE_SUPERIOR;
	}
	
	//Metodos getter
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public int getLIMITE_INFERIOR() {
		return this.LIMITE_INFERIOR;
	}
	public int getLIMITE_SUPERIOR() {
		return this.LIMITE_SUPERIOR;
	}
	
	//Metodo para clonar que retorna um novo objeto com os mesmos valores da instancia usada
	//na chamada do metodo
	public static Ponto clonarPonto(Ponto _ponto) throws Exception {
			Ponto pontoClonado = new Ponto(_ponto.x, _ponto.y);
			return pontoClonado;
	}
	
	//Metodo para trocar os valores de x e y
	public static Ponto pontoSwap(Ponto _ponto) throws Exception {
		Ponto pontoSwap = new Ponto(_ponto.y, _ponto.x);
		return pontoSwap;
	}
	
	//Metodo temEixoComum para verificar se algum eixo das instancias se cruzam
	public boolean temEixoComum(Object object) {
		Ponto aux = (Ponto) object;
		if (this.getX() == aux.getX() || this.getY() == aux.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para calcular a distancia euclidiana entre dois pontos
	//d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))
	public double distanciaPontos(Object object) {
		Ponto aux = (Ponto) object;
		double distanciaEuclidiana = Math.sqrt((Math.pow((this.getX() - aux.getX()), 2) + (Math.pow((this.getY() - aux.getY()), 2))));
		return distanciaEuclidiana;
	}
	
	//Versoes sobrecarregadas do metodo distanciaPontos
	//Como se fossem construtores sobrecarregados, porem com parametros diferentes para se trabalhar
	//Devemos reusar o codigo o maximo que pudermos!
	
	//Metodo distanciaDaOrigem para calcular a distancia euclidiana com a origem
	public double distanciaDaOrigem() throws Exception {
		Ponto origem = new Ponto(0,0);
		double distanciaOrigem = this.distanciaPontos(origem);
		return distanciaOrigem;
	}
	
	//Metodo compareTo usando como referencia as distancias do ponto ate a origem
	public int compareTo(Object object) throws Exception {
		Ponto aux = (Ponto) object;
		double distanciaA = this.distanciaDaOrigem();
		double distanciaB = aux.distanciaDaOrigem();
		if (distanciaA > distanciaB) {
			return 1;
		}
		else if (distanciaA == distanciaB) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	//Metodo equals para comparar x e y ou duas coordenadas (?)
	public boolean equals(Object object) {
		Ponto aux = (Ponto) object;
		if (this.getX() == aux.getX() && this.getY() == aux.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo toString para imprimir "(x,y)"
	public String toString() {
		StringBuilder coord = new StringBuilder();
		coord.append(" (");
		coord.append(this.getX());
		coord.append(",");
		coord.append(this.getY());
		coord.append(")");
		return coord.toString();
	}
}
