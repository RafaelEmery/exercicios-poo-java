package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para trabalhar com pontos em 3D (x,y,z).
//----------------------------------------------------------------------------------------------------------------


public class Ponto3D extends Ponto2D {
	private double z;
	private double limiteInferior = 0; //Falta herdar da classe Ponto2D
	private double limiteSuperior = 500;
	
	//Metodos construtores
	public Ponto3D() throws Exception {
		super();
		this.setZ(0);
	}
	public Ponto3D(double _x, double _y, double _z) throws Exception {
		super(_x, _y);
		this.setZ(_z);
	}
	
	//Metodos set
	public void setZ(double _z) throws Exception {
		if (_z > this.limiteInferior && _z < limiteSuperior) {
			this.z = _z;
		}
		else {
			throw new Exception("valor invalido.");
		}
	}
	
	//Metodos get
	public double getZ() {
		return this.z;
	}
	
	//Metodo para verificar se possui eixo em comum
	public boolean temEixoComum(Object object) {
		Ponto3D aux = (Ponto3D) object;
		if (this.getX() == aux.getX() || this.getY() == aux.getY() || this.getZ() == aux.getZ()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo para calcular a distancia euclidiana
	public static double distancia(double x1, double y1, double z1, double x2, double y2, double z2) {
		double distanciaPontos = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
		return distanciaPontos;
	}
	public double distancia(Ponto3D ponto) {
		return Ponto3D.distancia(this.getX(), this.getY(), this.getZ(), this.getX(), this.getY(), this.getZ());
	}
	public double distancia(double x1, double y1, double z1) {
		return Ponto3D.distancia(this.getX(), this.getY(), this.getZ(), x1, y1, z1);
	}
	
	//Metodo para calcular a distancia da origem
	public double distanciaOrigem() {
		return Ponto3D.distancia(this.getX(), this.getY(), this.getZ(), 0, 0, 0);
	}
	
	//Metodo compareTo atraves da distancia euclidiana
	public int compareTo(Ponto3D ponto) {
		if (this.distanciaOrigem() > ponto.distanciaOrigem()) {
			return 1;
		}
		else if (this.distanciaOrigem() == ponto.distanciaOrigem()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	//Metodo equals
	public boolean equals(Ponto3D ponto) {
		if (this.getX() == ponto.getX() && this.getY() == ponto.getY() && this.getZ() == ponto.getZ()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo toString
	public String toString() {
		//Nao usa o super.toString() pois ficaria "((x,y),z)"
		StringBuilder p = new StringBuilder();
		p.append("(");
		p.append(this.getX());
		p.append(",");
		p.append(this.getY());
		p.append(",");
		p.append(this.getZ());
		p.append(")");
		return p.toString();
	}
}
