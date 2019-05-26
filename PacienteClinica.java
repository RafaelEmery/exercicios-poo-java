//Colocar um cabecalho bonito
//Colocar tratamento de erros
//Acertar o problema da classe DataNascimento
//Mudar o nome da classe DataNascimento

package exerciciosGitHub;

public class PacienteClinica extends Pessoa{
	private String planoSaude;
	
	//Metodos construtores
	public PacienteClinica(String _nome, int _identidade, DataNascimento _dataNascimento, String _planoSaude) {
		super(_nome, _identidade, _dataNascimento);
		this.setPlanoSaude(_planoSaude);
	}
	
	//Metodos setter
	public void setPlanoSaude(String _planoSaude) {
		this.planoSaude = _planoSaude;
	}
	
	//Metodos getter
	public String getPlanoSaude() {
		return this.planoSaude;
	}
	
	//Metodo toString()
	public String toString() {
		StringBuilder pac = new StringBuilder();
		pac.append(super.toString());
		pac.append(" - ");
		pac.append(this.getPlanoSaude());
		return pac.toString();	
	}
}
