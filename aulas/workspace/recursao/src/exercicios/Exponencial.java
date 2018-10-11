package exercicios;

public class Exponencial {
	public static void main(String[] args) {

		System.out.println(Exponencial.calcular(2,2 ));

	}

	private static int calcular(int n1, int n2) {
		if ( n2 == 0 ) {
			System.out.print(" = ");
			return 1 ;
		} else {
			System.out.print(n1 + " * ");
			return n1 * calcular(n1, --n2);
		}
			
		
	
		
			

	

	}

}
