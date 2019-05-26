package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 12/05/2019
//Objetivo: classe Aluno para realizar metodos de interface e calculo de media
//----------------------------------------------------------------------------------------------------------------
//1) o metodo ultrapassouLimite deve ser estatico pois o usuario nao chama ele sobre um objeto especifico
// na classe UsoAluno, e sim quando quer saber se uma determinada nota ultrapassou o limite definido. Alem disso,
// a nota que comparamos com o limite eh trabalhada unicamente dentro do metodo (como uma var. local), logo nao
// faz sentido termos um metodo dinamico usando getNota() ou usando a nota de um objeto.


public class Aluno {
	private String nome;
	private double nota1, nota2, media, pontos;
	private static double  LIMITE_MAX = 10.0;
	
	// quatro construtores sobrecarregados
	public Aluno(String _nome,double _nota1,double _nota2,double _pontos) {
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2, double _pontos) {
		this("sem nome", _nota1, _nota2, _pontos);
	}
	public Aluno(double _nota1, double _nota2) {
		this(_nota1, _nota2, 0.0);
	}
	public Aluno() {
		this(0.0,0.0);
	}
	
	// métodos de interface para acesso aos campos privados
	public String getNome() {
		return this.nome;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public double getNota1() {
		return this.nota1;
	}
	public double getNota2() {
		return this.nota2;
	}
	public double getMedia() {
		return this.media;
	}
	public double getPontos() {
		return this.pontos;
	}
	public void setPontos(double _pontos) {
		this.pontos = _pontos;
		this.calculaMedia(10);
	}
	
	// tratamento de erro ainda inadequado, será melhorado mais adiante
	public boolean setNotas(double _nota1, double _nota2, double _pontos) {
		this.pontos = _pontos;
		if(_nota1>=0 && _nota1<=  LIMITE_MAX && _nota2>=0 && _nota2<=  LIMITE_MAX) {
		this.nota1 = _nota1;
		this.nota2 = _nota2;
		this.calculaMedia(10);
		return true;
		}
		else
		return false;
	}
	
	public void setNotas(double _nota1, double _nota2) {
	this.setNotas(_nota1, _nota2, 0);
	}
	
	public static void setLIMITE_MAX(double _LIMITE_MAX) {
		if (_LIMITE_MAX > 0 ) {
			LIMITE_MAX = _LIMITE_MAX;
		}
		else {
			LIMITE_MAX = 10; //Default caso o usuario defina um numero negativo
		}
	}
	
	//Metodo para determinar se uma nota ultrapassou o limite permitido
	public static boolean ultrapassouLimite(double _nota) {
		if (_nota > LIMITE_MAX) { //Caso a nota seja maior que o limite
			return true;
		}
		else {
			return false;
		}
	}
		
	// método para calcular a média. Privado pois o uso é apenas interno a classe
	private double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos())/2;
		return this.media;
	}
	
	// sobrecarregamento do cálculo da média para limitar o valor máximo
	private double calculaMedia(int _limite) {
		this.calculaMedia();
		if(this.media > _limite)
		this.media = _limite;
		return this.media;
	}
	
	// não é adequado que o método toString exiba mensagens, pois
	// é comum considerar que o programador de classes não conhece o usuário final
	// Evita-se também textos retornados, escritos em uma determinada língua.
	public String toString(){
		return this.getNome()+";"
		+this.getNota1()+";"
		+this.getNota2()+";"
		+this.getPontos()+";"
		+this.getMedia();
	}
}
