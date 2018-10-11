package exercicios;

public class Fatorial {

	public static void main(String[] args) {
		System.out.println(Fatorial.calcular(3));
	}

	private static int calcular(int n1) {
		if (n1 == 0) {
			System.out.print(" = ");
			return 1;
	}else {
			
		return n1 * calcular (--n1);

		
	}
	}
}
