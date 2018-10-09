package exemplos;

public class ExcecaoStringNaoExiste {
	public static void main(String[] args) {
		try {
			// null- nao existe
			String a = null;

			System.out.println(a.charAt(0));
		} catch (java.lang.NullPointerException npe) {
			System.out.println("nao pode chamar um metodo de referencia nula !");
			npe.printStackTrace();
		}
	}
}
// ponteiro nulo

//nome+f2 muda o nome da classe