package exerciciosGitHub;

public class UsoData {
	public static void main(String args[]) {
		Data dt1, dt2;
		
		//Entrando com os valores de data
		dt1 = new Data(25, "agosto", 1997);
		dt2 = new Data("20/3/2019");
		
		//Imprimindo os valores
		System.out.println(dt1);
		System.out.println(dt2);
		
		//Imprimindo o metodo equals
		System.out.println("Os dois objetos sao iguais? " + dt1.equals(dt2));
		System.out.println("A data 1 eh menor? " + dt1.compareTo(dt2));

	}
}
