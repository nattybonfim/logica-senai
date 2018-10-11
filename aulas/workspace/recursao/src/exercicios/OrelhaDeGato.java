package exercicios;

public class OrelhaDeGato {
	public static void main(String[] args) {
		System.out.println(OrelhaDeGato.calcular(2));
	}

	private static int calcular(int numeroGatos) {
		if (numeroGatos == 0) {
			return 0;

		} else {

			return 2 + calcular(numeroGatos - 1);

		}

	}
}
