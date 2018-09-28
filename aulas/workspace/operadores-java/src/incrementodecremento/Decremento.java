package incrementodecremento;

public class Decremento {
	

	
	
	
	
   public static void main(String[] args) {
	   int x = 10;
		x--;// 11
		
		System.out.println("o valor de x é:" + x);
		int y = x--;
		System.out.println("o valor de x e:" + x);
		System.out.println("o valor de y é:" + y);
		int z = --x;		
				
	    System.out.println("o valor de z é:" + z);
		System.out.println("o valor de x é:" + x);
		
		// retorna imediatamente o incremento
		//int soma = 1 + --x;
		
		
		
		// incrementa depois de associar o valor
		int soma = 1+ x--;
		
		 System.out.println(soma);
		 
		 
	
				
}
}
