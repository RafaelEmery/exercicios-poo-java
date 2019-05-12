package exerciciosGitHub;
public class Data { 
	private int dia, mes, ano;
	
	//Metodos de set e get para os valores
	//Metodos set sobrecarregados para diferentes entradas
	public void setData(int dia, int mes, int ano) {
		//Verificacao da data valida
		if (Data.isDataValida(dia, mes, ano) == true) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		else {	
			//Atribuindo uma data default
			this.dia = 01;
			this.mes = 01;
			this.ano = 1900;
		}
	}
	//this.setData(valores)
	public void setData(int dia, String mes, int ano) {
		String mesStr = mes;

		if ("janeiro".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 1, ano);
		}
		else if ("fevereiro".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 2, ano);
		}
		else if ("marco".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 3, ano);
		}
		else if ("abril".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 4, ano);
		}
		else if ("maio".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 5, ano);
		}
		else if ("junho".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 6, ano);
		}
		else if ("julho".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 7, ano);
		}
		else if ("agosto".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 8, ano);
		}
		else if ("setembro".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 9, ano);
		}
		else if ("outubro".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 10, ano);
		}
		else if ("novembro".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 11, ano);
		}
		else if ("dezembro".equalsIgnoreCase(mesStr)) {
			this.setData(dia, 12, ano);
		}
		else {
			this.setData(1, 1, 1900);
		}
	}
	public void setData(String data) {
		//Pegar o indice das barras da data
		//Usar o substring com a var do numero da barra
		//Converter para inteiro e setar
		String diaStr, mesStr, anoStr;
		int dia, mes, ano;
		int indexStr1, indexStr2; //Armazenar em um vetor?
		
		indexStr1 = data.indexOf("/");
		indexStr2 = data.indexOf("/", indexStr1 + 1);

		diaStr = data.substring(0, indexStr1);
		mesStr = data.substring(indexStr1 + 1, indexStr2);
		anoStr = data.substring(indexStr2 + 1, indexStr2 + 5);

		dia = Integer.parseInt(diaStr);
		mes = Integer.parseInt(mesStr);
		ano = Integer.parseInt(anoStr);

		this.setData(dia, mes, ano);
	}

	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}

	//Metodos construtores sobrecarregados para a entrada de dados	
	public Data() {
		this.setData(1, 1, 1900);
	}
	public Data(int dia, int mes, int ano) {
		this.setData(dia, mes, ano);
	}
	public Data(int mes, int ano) {
		this.setData(1, mes, ano);
	}
	public Data(int dia, String mes, int ano) {
		this.setData(dia, mes, ano);
	}
	public Data(String data) {
		this.setData(data);
	}

	//Metodos para validar as datas entradas
	public static boolean isDataValida(int dia, int mes, int ano) {
		//Verif. basica
		if (dia <= 31 && mes <= 12 & ano >= 1582) {
			//Verif de meses com 30 dias
			if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
				return true;	
			}
			//Verif de fevereiro
			if (mes == 2) {
				if (Data.isBissexto(ano)) {
					if (mes <= 29) {
						return true;
					}
					else {	
						return false;
					}
				}
				else {	
					if (dia <= 28) {		
						return true;
					}
					else {	
						return false;
					}
				}
			}
			//O resto sao os meses com 31 dias
			else {
				return true;
			}		
		}
		else {
			//Caso a data nao passe pelo teste de validacao
			return false;
		}
	}

	public static boolean isBissexto(int ano) {
		//Verif. para ano bissexto
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) { 
			return true;
		}
		else {
			return false;
		}
	}

	//Metodo equals para ser usado no UsoData.java
	public boolean equals(Data data) {
		Data aux = data;
		if (this.getDia() == aux.getDia() && this.getMes() == aux.getMes() && this.getAno() == aux.getAno()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo compareTo() para as datas - questao 7
	//Deve ser dinamico pois iremos chamar com data1.compareTo(data2) e iremos comparar a primeira data com a segunda.
	//Se fosse estatico, iriamos ter que chamar a classe junto.
	//Uma situacao de uso seria uma verificacao de datas de nascimento de duas pessoas. Caso a data de uma seja maior que
	//a outra, significa que essa pessoa eh a mais velha. A partir dai conseguimos ordenar uma lista (ou vetor) de pessoas 
	//por idade, comparando uma por uma.
	public int compareTo(Data data) {
		Data aux = data;
		if (this.getAno() > aux.getAno()) {
			return 1;
		}
		else if (this.getAno() == aux.getAno()) {
			if (this.getMes() > aux.getMes()) {
				return 1;
			}
			else if (this.getMes() < aux.getMes()) {
				return -1;
			}
			else {
				if (this.getDia() > aux.getDia()) {
					return 1;
				}
				else if (this.getDia() == aux.getDia()) {
					return 0;
				}
				else {
					return -1;
				}
			}
		}
		else {
			return -1;
		}
	}
			
	//Metodo toString para devolver a data para "dd/mm/aaaa"
	//Modificar o metodo toString() com a classe StringBuilder para concatenar dados
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append(this.getDia());
		data.append("/");
		data.append(this.getMes());
		data.append("/");
		data.append(this.getAno());
		data.append(";");
		return data.toString(); 
	}
}