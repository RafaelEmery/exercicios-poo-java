package exerciciosGitHub;

//----------------------------------------------------------------------------------------------------------------
//Autor: Rafael Emery
//Data: 25/05/2019
//Objetivo: classe para instanciar e testar os metodos da classe CirculoEscalavel
//----------------------------------------------------------------------------------------------------------------

public class DemoCirculoEscalavel {
	public static void main(String[] argumentos) {
		try {
			CirculoEscalavel ce = new CirculoEscalavel(new Ponto2D(10,10),30);
			
			System.out.println(ce); //Imprime os dados do circulo

			ce.amplia(3); //Ampliando a escala do circulo
			
			System.out.println(ce); // Imprimimos novamente os dados do círculo
			
			ce.espelha(); // Modificamos a posição do círculo (espelhado)
			
			System.out.println(ce); // Imprimimos novamente os dados do círculo
			
			//Perguntando se ce e uma instancia da classe/interfaces
			System.out.println(ce instanceof CirculoEscalavel); // true
			System.out.println(ce instanceof ObjetoGeometrico); // true
			System.out.println(ce instanceof Escalavel); // true
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
