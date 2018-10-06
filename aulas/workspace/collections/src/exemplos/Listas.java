package exemplos;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		// array so comparaçao
		String[] nomes = { "Natalia", "Fulano", "Ciclano", "Beltrano" };
		// imprimir array
		System.out.println(nomes);

		ArrayList<String> listaNomes = new ArrayList<>();

		// add adciona um elemento

		listaNomes.add("Natalia");
		listaNomes.add("Fulano");
		listaNomes.add("Ciclano");
		listaNomes.add("Beltrano");

		System.out.println(listaNomes);

		// size- mostra a quantidade de elementos
		int tamanhoListaNomes = listaNomes.size();
		System.out.println("ArrayList: " + tamanhoListaNomes);

		int tamanhoArrayNomes = nomes.length;
		System.out.println("Array :" + tamanhoArrayNomes);

		// contains(obj)- verifica se o elemento existe na coleçao
		boolean existeNome = listaNomes.contains("Fulano");
		System.out.println(existeNome);

		existeNome = listaNomes.contains("Jose");
		System.out.println(existeNome);

		// remove(obj)- remove um elemento da lista
		 boolean foiRemovido = listaNomes.remove("Natalia");
		 System.out.println(foiRemovido);
		 
		 foiRemovido = listaNomes.remove("BatataFrita");
		 System.out.println(foiRemovido);
		 
		 //imprimir lista
		 System.out.println(listaNomes);
		 
		 // get -obter elemento atraves do seu indice
		String nomeEscolhido = listaNomes.get(1);
		System.out.println(nomeEscolhido);
		
		
		// indexOf- obter indice do elemento atraves do seu nome
		 int indiceDoBeltrano = listaNomes.indexOf("Beltrano");
		 String beltrano = listaNomes.get(indiceDoBeltrano);
		 System.out.println(beltrano);
		
		 
		 
		 // addAll(collection -add uma lista dentro dessa		 
		 ArrayList<String> listaDeOutrosNomes = new ArrayList<>();
		 listaDeOutrosNomes.add("Pitiko");
		 listaDeOutrosNomes.add("Bilu");
		 listaDeOutrosNomes.add("Pingo");
		 
		 
		 listaNomes.addAll(listaDeOutrosNomes);
		 System.out.println(listaNomes);
		 
		 
		 

	}

}
