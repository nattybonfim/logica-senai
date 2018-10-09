package exemplos;

public class Widening {
	public static void main(String[] args) {

		byte num3 = 14;
		int num4 = 120;
// ele converte p maior no caso p int
		double resultadoDiv2 = num3 / num4;
		//ele guarda no double
		System.out.println(resultadoDiv2);

		// exemplos

		float num5 = 14;
		int num6 = 120;
		//ele deixou os dois como float 
		double resultadoDiv3 = num5 / num6;
		System.out.println(resultadoDiv3);
	}

}
