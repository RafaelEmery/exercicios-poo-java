//Colocar um cabecalho bonito
//Colocar tratamento de erros
//Acertar o problema da classe DataNascimento
//Mudar o nome da classe DataNascimento

package exerciciosGitHub;

public class Chefe extends Pessoa{
	private String departamento;
	private int salario;
	private DataNascimento dataAdmissao;
	
	//Metodos construtores
	public Chefe(String _nome, int _identidade, DataNascimento _dataNascimento, DataNascimento _dataAdmissao, int _salario, String _departamento) throws Exception {
		super(_nome, _identidade, _dataNascimento);
		this.setDepartamento(_departamento);
		this.setSalario(_salario);
		this.setDataAdmissao(_dataAdmissao);
	}
	
	//Metodos setter
	public void setDepartamento(String _departamento) throws Exception {
		this.departamento = _departamento;
	}
	public void setSalario(int _salario) throws Exception {
		if (_salario > 0) {
			this.salario = _salario;
		}
		else {
			throw new Exception("Salario negativo invalido.");
		}
	}
	public void setDataAdmissao(DataNascimento _dataAdmissao) {
		this.dataAdmissao = _dataAdmissao;
	}
	
	//Metodos getter
	public String getDepartamento() {
		return this.departamento;
	}
	public int getSalario() {
		return this.salario;
	}
	public DataNascimento getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	//Metodo toString()
	public String toString() {
		StringBuilder chefe = new StringBuilder();
		chefe.append(super.toString());
		chefe.append(" - ");
		chefe.append(this.getDataAdmissao());
		chefe.append(" - ");
		chefe.append(this.getSalario());
		chefe.append(" - ");
		chefe.append(this.getDepartamento());
		return chefe.toString();
	}
}
