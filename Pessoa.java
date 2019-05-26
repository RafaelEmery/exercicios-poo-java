//Colocar um cabecalho bonito
//Colocar tratamento de erros
//Acertar o problema da classe DataNascimento
//Mudar o nome da classe DataNascimento

package exerciciosGitHub;

public class Pessoa {
	private String nome;
	private int identidade;
	@SuppressWarnings("unused")
	private DataNascimento data;
	
	//Metodos construtores
	public Pessoa() throws Exception {
		this.setNome("Digite seu nome");
		this.setIdentidade(0);
		this.data = new DataNascimento(1,1,1900);
	}
	public Pessoa(String _nome, int _identidade, int _dia, int _mes, int _ano) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.data = new DataNascimento(_dia, _mes, _ano);
	}
	public Pessoa(String _nome, int _identidade, DataNascimento _dataNascimento) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataNascimento(_dataNascimento);
	}
	
	//Metodos setter
	public void setNome(String _nome) throws Exception {
		this.nome = _nome;
	}
	public void setIdentidade(int _identidade) throws Exception {
		if (_identidade > 0) {
			this.identidade = _identidade;
		}
		else {
			throw new Exception("Identidade invalida");
		}
	}
	
	//Metodos getter
	public String getNome() {
		return this.nome;
	}
	public int getIdentidade() {
		return this.identidade;
	}
	public DataNascimento getData() {
		return this.data;
	}
	
	public String toString() {
		StringBuilder pessoa = new StringBuilder();		
		pessoa.append(this.getNome());
		pessoa.append(" - ");
		pessoa.append(this.getIdentidade());
		pessoa.append(" - ");
		pessoa.append(this.getData());
		return pessoa.toString();
	}
}
