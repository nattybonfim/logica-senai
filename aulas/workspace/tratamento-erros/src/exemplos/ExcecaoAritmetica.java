package exemplos;

public class ExcecaoAritmetica {
	public static void main(String[] args) {
		try {
		int a = 30, b = 0;
		int c = a / b;
		System.out.println("Resultado = " + c);
		
	     

	} catch(ArithmeticException ae ) {
		System.out.println("Nao pode dividir por zero,seu animal");
		
	}

	
		
	}
}
