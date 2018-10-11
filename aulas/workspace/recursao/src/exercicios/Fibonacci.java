package exercicios;

public class Fibonacci {
	public static void main(String[] args) {
		int sequencia = 20;

		for (int i = 0; i <= 15; i++) {
			System.out.println(Fibonacci(i));
		}
	}

	private static int Fibonacci(int sequencia) {
		if (sequencia <= 1) {
			return sequencia;
		} else {
			return Fibonacci(sequencia - 1) + Fibonacci(sequencia - 2);
		}
	}
}
