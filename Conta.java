package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 11/05/2019
//Objetivo: classe conta para operacoes envolvendo a mesma.
//----------------------------------------------------------------------------------------------------------------

public class Conta {
	private String nome;
	private double saldo;
	private static double TAXA_JUROS = 0;
	
	//Construtores sobrecarregados
	public Conta() throws Exception {
		this.setNome("Digite aqui");
		this.setSaldo(0);
	}
	public Conta(String _nome, double _saldo) throws Exception {
		this.setNome(_nome);
		this.setSaldo(_saldo);
	}
	
	//Metodos setter
	public void setNome(String _nome) throws Exception {
		this.nome = _nome;
	}
	public void setSaldo(double _saldo) throws Exception {
		if (_saldo >= 0) {
			this.saldo = _saldo;
		}
		else {
			throw new Exception("Saldo negativo invalido.");
		}
	}
	public static void setTAXA_JUROS(double _TAXA_JUROS) throws Exception {
		if (_TAXA_JUROS >= 0) {
			TAXA_JUROS = _TAXA_JUROS;
		}
		else {
			throw new Exception("Taxa de juros invalida.");
		}
	}
	
	//Metodos getter
	public String getNome() {
		return this.nome;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	//Metodo para corrigir saldo
	public void corrigeSaldo() throws Exception {
		double saldoCorrigido = this.getSaldo() - (this.getSaldo() * Conta.TAXA_JUROS);
		if (saldoCorrigido >= 0) {
			this.setSaldo(saldoCorrigido);
		}
		else {
			throw new Exception("Saldo negativo invalido.");
		}
	}
	
	//Metodo toString()
	public String toString() {
		StringBuilder conta = new StringBuilder();
		conta.append("Nome do correntista: ");
		conta.append(this.getNome());
		conta.append(" - Saldo: ");
		conta.append(this.getSaldo());
		conta.append(".");
		return conta.toString();
	}
}

