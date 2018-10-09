package exemplos;

public class ExcecaoArrayNoExiste {
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(" 12983746x ");

			System.out.println(num);
		} catch (java.lang.NumberFormatException nfe) {
			System.out.println("Isso é um numero?");
			nfe.printStackTrace();
		}
	}
}
