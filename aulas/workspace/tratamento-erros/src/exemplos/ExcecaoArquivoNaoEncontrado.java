package exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcecaoArquivoNaoEncontrado {
	public static void main(String[] args) {
		try {
			File file = new File("");
			file = new File("E://arquivo.txt");
			FileReader fr = new FileReader(file);

		} catch (FileNotFoundException fnfe) {
			System.out.println("Nao sei o que voce ta procurando");
			fnfe.printStackTrace();
		}
	}
}
