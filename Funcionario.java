//Colocar um cabecalho bonito
//Colocar tratamento de erros
//Acertar o problema da classe DataNascimento
//Mudar o nome da classe DataNascimento

package exerciciosGitHub;

public class Funcionario extends Pessoa{
	private DataNascimento dataAdmissao;
	private int salario;
	
	//Metodos construtores
	public Funcionario(String _nome, int _identidade, DataNascimento _dataNascimento, DataNascimento _dataAdmissao, int _salario) {
		super(_nome, _identidade, _dataNascimento);
		this.setDataAdmissao(_dataAdmissao);	
		this.setSalario(_salario);
	}
	
	//Metodos setter
	public void setDataAdmissao(DataNascimento _dataAdmissao) {
		this.dataAdmissao = _dataAdmissao;
	}
	public void setSalario(int _salario) {
		this.salario = _salario;
	}
	
	//Metodos getter
	public DataNascimento getDataAdmissao() {
		return this.dataAdmissao;
	}
	public int getSalario() {
		return this.salario;
	}
	
	//Metodo toString()
	public String toString() {
		StringBuilder funcionario = new StringBuilder();
		funcionario.append(super.toString());
		funcionario.append(" - ");
		funcionario.append(this.getDataAdmissao());
		funcionario.append(" - ");
		funcionario.append(this.getSalario());
		return funcionario.toString();
	}
 }
