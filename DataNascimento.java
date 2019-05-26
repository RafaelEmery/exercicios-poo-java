//Colocar um cabecalho bonito
//Colocar tratamento de erros
//Acertar o problema da classe DataNascimento
//Mudar o nome da classe DataNascimento

package exerciciosGitHub;

public class DataNascimento {
	private int dia, mes, ano;
	
	//Metodos construtores
	public DataNascimento() {
		this.setData(1,1,1900);
	}
	public DataNascimento(int _dia, int _mes, int _ano) {
		this.setData(_dia, _mes, _ano);
	}
	
	//Metodos setter
	public void setData(int _dia, int _mes, int _ano) {
		this.dia = _dia;
		this.mes = _mes;
		this.ano = _ano;
	}
	
	//Metodos getter
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
	
	//Metodo toString
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append(this.getDia());
		data.append("/");
		data.append(this.getMes());
		data.append("/");
		data.append(this.getAno());
		data.append(".");
		return data.toString();
	}
}
