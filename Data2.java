package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 12/05/2019
//Objetivo: classe Data2 com metodos de interface, validacao e algumas operacoes.
//----------------------------------------------------------------------------------------------------------------
//O metodo isDataValida deve ser estatico? Sim, pois nao temos necessidade de fazer chamando cada objeto. Podemos
//inserir o objeto como parametro. Assim, alocamos memoria para o metodo uma unica vez.
//O metodo isBissexto deve ser estatico? Sim, pelo mesmo motivo pelo qual isDataValida.
//Seria util uma versao sobrecarregada do isDataValida e isBissexto ambos sem argumentos? Sim, porem os metodos
//teriam de ser dinamicos e o objeto em questao (verificacao) seria chamado junto ao metodo.
//


import java.util.Scanner;

public class Data2 {
	Scanner ler = new Scanner(System.in); //Variavel para otimizar a entrada de dados
	private int dia, mes, ano;

	//Metodos de set e get para os valores
	//Metodos set sobrecarregados para diferentes entradas

	//Metodos throw e throws para todas as datas invalidas, ou seja,
	//todos os setData e as validacoes recebem o throws Exception
	public void setData2(int dia, int mes, int ano) throws Exception {
		//Verificacao da data valida
		if (Data.isDataValida(dia, mes, ano) == true) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		else {
			//Disparar um erro ao inves de assumir uma data padrao
			//Instanciando um objeto da classe Exception
			throw new Exception("Tente novamente.");
		}
	}
	//this.setData(valores)
	public void setData2(int dia, String mes, int ano) throws Exception {
		int m = 0;
		
		if ("janeiro".equalsIgnoreCase(mes)) 			m = 1;				
		else if ("fevereiro".equalsIgnoreCase(mes)) 	m = 2;				
		else if ("marco".equalsIgnoreCase(mes)) 		m = 3;				
		else if ("abril".equalsIgnoreCase(mes)) 		m = 4;				
		else if ("maio".equalsIgnoreCase(mes)) 			m = 5;				
		else if ("junho".equalsIgnoreCase(mes)) 		m = 6;				
		else if ("julho".equalsIgnoreCase(mes)) 		m = 7;				
		else if ("agosto".equalsIgnoreCase(mes)) 		m = 8;			
		else if ("setembro".equalsIgnoreCase(mes)) 		m = 9;			
		else if ("outubro".equalsIgnoreCase(mes))		m = 10;			
		else if ("novembro".equalsIgnoreCase(mes)) 		m = 11;		
		else if ("dezembro".equalsIgnoreCase(mes)) 		m =  12; 
		
		this.setData2(dia, m, ano);
		
	}
	public void setData2(String data) throws Exception {
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

		this.setData2(dia, mes, ano);
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
	public Data2() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}
	public Data2(int dia, int mes, int ano) throws Exception {
		this.setData2(dia, mes, ano);
	}
	public Data2(int mes, int ano) throws Exception {
		this.setData2(1, mes, ano);
	}
	public Data2(int dia, String mes, int ano) throws Exception {
		this.setData2(dia, mes, ano);
	}
	public Data2(String data) throws Exception{
		this.setData2(data);
	}
	
	//É valido. Pois caso o usuário não necessite colocar parâmetros na classe UsoData,
	//o método dinâmico iria  
	public boolean isDataValida() {
		return Data2.isDataValida(this.dia, this.mes, this.ano);
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
	
	//Metodos para incrementar sobrecarregados
	public Data2 incrementarUmData() {
		//Data padrão definida para, caso nao entre em nenhuma condicao abaixo, o metodo retorne a mesma coisa
		Data2 dt = new Data2();
		
		//O try catch para a linguagem verificar se possui erro
		try {
			dt = new Data2(this.dia, this.mes, this.ano);
			
			//Caso a data com dia + 1 seja valida, retorna faz o set e retorna a data com incremento
			if (Data2.isDataValida(dt.getDia() + 1, dt.getMes(), dt.getAno()) == true) {
				dt.setData2(dia + 1, mes, ano);
				return dt;
			}
			//Caso a data com dia + 1 seja invalida, faz o set com dia 1, e verifica o mes + 1
			//Se o mes + 1 for valido, retorna a data com incremento
			if (Data2.isDataValida(1, dt.getMes() + 1, dt.getAno())) {
				dt.setData2(1, mes + 1, ano);
				return dt;
			}
			//Caso o dia + 1 e o mes + 1 for invalido, faz o set com o ano + 1
			//O que significa que eh o ultimo dia do mes, ultimo mes do ano
			//Entao ano recebe um incremento e o metodo retorna a data com incremento
			if (Data2.isDataValida(1, dt.getMes(), dt.getAno() + 1)) {
				dt.setData2(1, 1, ano + 1);
				return dt;
			}
		}
		//catch exibindo o erro que aconteceu
		catch (Exception e) {
			System.out.println("Data invalida. Impossivel incrementar!");
		}
		//Retornando o dt caso nao entre nas condicoes acima
		return dt;
	}
	
	public void incrementarUmData(int qntDias) {
		int i;
		
		//O try catch para a linguagem verificar se possui erro
		try {
			//Declarando a variavel pegando os dados do objeto dt da funcao anterior
			Data2 dt = new Data2(this.getDia(), this.getMes(), this.getAno());
			
			//Laco para incremetar um dia por vez
			for(i = 0; i < qntDias; i++) {
				//Incrementando a variavel de data (com os campos dia, mes e ano) como se fosse i = i + 1;
				dt = dt.incrementarUmData();
			}
		}
		//Possivel erro gerado pela execucao do programa
		catch (Exception e) {
			System.out.println("Data invalida. Impossivel incrementar!");
		}
	}
	
	//Metodo estatico para criar e verificar uma data
	public static Data2 verificaECriaData(int _dia, int _mes, int _ano) throws Exception {
		if (Data2.isDataValida(_dia, _mes, _ano)) {
			//Caso a data seja valida, cria um objeto e retorna ele
			Data2 dataMetodo = new Data2(_dia, _mes, _ano);
			return dataMetodo;
		}
		else {
			//Caso invalida, null
			return null;
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
