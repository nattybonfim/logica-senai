package exemplos;

import java.util.HashSet;

public class Sets {
	public static void main(String[] args) {

		HashSet<String> conjuntoNomes = new HashSet<>();

		conjuntoNomes.add("Corolla");
		conjuntoNomes.add("Vectra");
		conjuntoNomes.add("Ford t");
		conjuntoNomes.add("Palio");
		conjuntoNomes.add("Camaro");

		//por que ele nao imprime na sequencia? ele nao se preucupa com sequencia
		System.out.println(conjuntoNomes);
		
		 boolean adicionou =conjuntoNomes.add("Camaro");
         System.out.println(adicionou);
         
         
         
	}
}