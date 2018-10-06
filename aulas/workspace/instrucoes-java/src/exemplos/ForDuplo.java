package exemplos;

public class ForDuplo {
	public static void main(String[] args) {
		int linhas = 2;
		int colunas = 2;
		for (int i = 0; i <= linhas; i++) {
			for (int j = 0; j <= colunas; j++) {
				System.out.print("[" + i + ", " + j + "]");
			}
			System.out.print("\n");
		}
	}

}
