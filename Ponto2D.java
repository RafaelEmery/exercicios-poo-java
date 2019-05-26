package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para trabalhar com pontos em 2D (x,y).
//----------------------------------------------------------------------------------------------------------------

public class Ponto2D {
	private double x, y ;
	public static final double LIMITE_INF_DEFAULT = 0;
	public static final double LIMITE_SUP_DEFAULT = 500;
	private static double LIMITE_INF = Ponto2D.LIMITE_INF_DEFAULT;
	private static double LIMITE_SUP = Ponto2D.LIMITE_SUP_DEFAULT;
	
	//Construtores sobrecarregados
	public Ponto2D() throws Exception {
		this(0,0);
	}
	Ponto2D(double _x, double _y) throws Exception {
		this.setX(_x);
		this.setY(_y);
	}
	
	//Metodos set
	public static boolean isLimite(double coordenada) {
		return coordenada >= Ponto2D.LIMITE_INF && coordenada <= Ponto2D.LIMITE_SUP;
	}
	public void setX(double _x)throws Exception{
		if(Ponto2D.isLimite(_x))
			this.x = _x;
		else
			throw new Exception ("valor de x fora dos limites");
	}
	public void setY(double _y)throws Exception{
		if(Ponto2D.isLimite(_y))
			this.y = _y;
		else
			throw new Exception ("valor de y fora dos limites");
	}
	
	//Metodos get
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public static double getLIMITE_INF() {
		return Ponto2D.LIMITE_INF;
	}
	public static double getLIMITE_SUP() {
		return Ponto2D.LIMITE_SUP;
	}
	public static void setLIMITE_INF(double inferior) {
		Ponto2D.LIMITE_INF = inferior;
	}
	public static void setLIMITE_SUP(double superior) {
		Ponto2D.LIMITE_SUP = superior;
	}
	public static double getLIMITE_SUP_DEFAULT() {
		return LIMITE_SUP_DEFAULT;
	}
	
	//Metodo que clona um ponto
	public Ponto2D clonar() throws Exception {
		return new Ponto2D(this.getX(), this.getY());
	}
	
	//Metodo que inverte as coordenadas de um ponto
	public Ponto2D criaSwap() throws Exception {
		return new Ponto2D(this.getY(), this.getX());
	}
	
	//Metodo que verifica eixos em comum
	public boolean temEixoComum(Ponto2D _PontoObj){
		return this.getX() == _PontoObj.getX() || this.getY() == _PontoObj.getY();
	}
	
	//Metodos sobrecarregados que calculam a distancia euclidiana entre dois pontos
	static public double distancia(double x1, double y1, double x2, double y2){
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	public double distancia(Ponto2D _PontoObj){
		return Ponto2D.distancia(this.getX(),this.getY(),_PontoObj.getX(),_PontoObj.getY());
	}
	public double distancia(double _x, double _y){
		return Ponto2D.distancia(this.getX(),this.getY(),_x,_y);
	}
	
	//Metodo que calcula a distancia do ponto a origem
	public double distanciaDaOrigem(){
		return Ponto2D.distancia(this.getX(),this.getY(),0,0);
	}
	
	//Metodo compareTo para comparar pontos
	public int compareTo(Ponto2D _PontoObj){
		if (this.distanciaDaOrigem() > _PontoObj.distanciaDaOrigem())
			return 1;
		else if(this.distanciaDaOrigem() < _PontoObj.distanciaDaOrigem())
			return -1;
		else
		return 0;
	}
	
	//Metodo equals verificar se dois pontos sao iguais
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Ponto2D other = (Ponto2D) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
			return true;
	}
	
	//Metodo toString() que imprime os pontos
	public String toString(){
		StringBuilder coord = new StringBuilder();
		coord.append("(");
		coord.append(this.getX());
		coord.append(",");
		coord.append(+this.getY());
		coord.append(")");
		return coord.toString();
	}
}
