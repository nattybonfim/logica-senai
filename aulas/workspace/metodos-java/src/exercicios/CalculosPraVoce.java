package exercicios;

public class CalculosPraVoce {
	public static void main(String[] args) {
		// Mostrar o return e sem o return
		// invocaçao
		System.out.println(CalculosPraVoce.soma(2.0, 4.0));

		// uma forma de invocar o metodo e imprimir o resultado
		CalculosPraVoce.subtracao(120.0, 10.0);

		// igual ao de cima mas guarda o resultado numa variavel pra depois imprimir
		double resultado = CalculosPraVoce.subtracao(120.0, 10.0);
		System.out.println(resultado);

		// invocando sem return
		CalculosPraVoce.multiplicacao(3.0, 3.0);
	}

	// declaraçao
	// o return encerra o metodo!
	private static double soma(double num1, double num2) {

		return num1 + num2;
	}

	private static double subtracao(double num1, double num2) {
		return num1 - num2;

	}

	// outra forma!
	private static void multiplicacao(double num1, double num2) {
		System.out.println("Multiplicacao" + num1 * num2);
	}

	private static double divisao(double num1, double num2) {
		return num1 / num2;
	}

}