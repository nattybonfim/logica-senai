package exemplos;

public class ExcecaoPonteiroNulo {
	public static void main(String[] args) {
		try {
			String a = "N�o sei o que t� fazendo";
			char c = a.charAt(50);
			System.out.println(c);
		} catch (java.lang.StringIndexOutOfBoundsException siobe) {
			System.out.println("esse indice nao existe");
			siobe.printStackTrace();
		}
	}
}
// indice string nao existe