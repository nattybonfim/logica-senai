package exemplos;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		// dentro do integer tem um "int"

		HashMap<Integer, String> alunosLogica = new HashMap<>();

		alunosLogica.put(1, "Alex");
		alunosLogica.put(2, "Alexandre");
		alunosLogica.put(3, "Andre");

		System.out.println(alunosLogica);

		for (Integer key : alunosLogica.keySet()) {

			System.out.println("Chave" + key);
			System.out.println(alunosLogica.get(key));

		}
		HashMap<String, String> empresas = new HashMap<>();

		empresas.put("Apple", "Empresa de eletronicos");
		empresas.put("Walmart", "Empresa de varejo");
		empresas.put("Sony", " Empresa de eletronicos");

		// recuperar valor do mapa

		String descricaoApple = empresas.get("Apple");
		System.out.println(descricaoApple);

		// mostrar tamanho do mapa
		System.out.println(empresas.size());

		// remover item do mapa
		empresas.remove("Sony");
		System.out.println(empresas);

	}

}
