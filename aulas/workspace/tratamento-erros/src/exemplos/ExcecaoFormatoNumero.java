package exemplos;

public class ExcecaoFormatoNumero {
	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[6] = 9;
		} catch (java.lang.ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Esse indice esta fora !");
			aiobe.printStackTrace();
		}
	}
}
