package selecao;

public class ElseIf {
	public static void main(String[] args) {
			
		float preco = 60.0f;
		
		if (preco <= 1.99) {
			
			System.out.println("Compra logo!");
		}else if(preco > 1.99 && preco <= 60.00) {
			System.out.println("ah , vou pensar");
			
		}else {
			System.out.println(" Falooo");
		}
		
	}

}
