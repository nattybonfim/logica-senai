package exemplos;

public class Narrowing {
	public static void main(String[] args) {

		// Narrowing
		double num1 = 10.28347;
		int num2 = 5;
		
		// ele converte o int em double(iguala os tipo e realiza ope
		// em long
		//

		long resultadoDvi = (long) num1 / num2;
		System.out.println(resultadoDvi);

	}

}
