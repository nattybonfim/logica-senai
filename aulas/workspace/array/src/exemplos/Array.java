package exemplos;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// 1) diversas maneiras de declarar array(vetor)
		double precos[] = new double[5];
		
		String euMeAm[] = {"no","seu","coraçao"};
		
		
		double[] salarios = new double[6];
		
		int[] numeros = {1,2,3,4};
		
		//2) imprimir um array nao vazio
		
		System.out.println(Arrays.toString(euMeAm));
		
		//3)imprimindo UMA VALOR de um array nao vazio
		
		System.out.println(numeros[2]);
		
		//4) imprimir um array vazio
		System.out.println(Arrays.toString(salarios));
		
		//5)colocar valor dentro de um array vazio
		salarios[2] = 1200.40;
		System.out.println(Arrays.toString(salarios));
	}

}
