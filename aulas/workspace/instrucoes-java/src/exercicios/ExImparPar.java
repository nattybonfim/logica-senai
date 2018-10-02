package exercicios;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class ExImparPar {
	public static void main(String[] args) throws InterruptedException {
		
		//Preparando a aplicação para receber o input do teclado
	
		InputStream entradaTeclado = System.in;
		Scanner respostaUsuario = new Scanner(entradaTeclado);
		
		// declarar as variaveis necessarias
		
		int numeroMaquina = 0;
		int numeroUsuario = 0;
		String escolhaUsuario ="";
		
		// mensagem de inicio
		System.out.println("Bora jogar um par ou impar aí,meu jovem?");
		String aceite = respostaUsuario.nextLine();
		if (aceite.equalsIgnoreCase("sim") || aceite.equalsIgnoreCase("ok")) {
		// 1) caso a resposta seja sim,entramos no jogo.
		
	
			System.out.println("Combinado,demorou!");
			
			//3)apenas recupera e limpa o conteudo da resposta do usuario 
			respostaUsuario.nextLine();
			
			System.out.println("Voce quer PAR ou IMPAR");
			
		
			// 4) agora nos interessa guardar a resposta em uma variavel,pq
			//precisamos saber se ele escolheu PAR ou IMPAR no decorrer do programa
			
			escolhaUsuario = respostaUsuario.nextLine();
			 if (escolhaUsuario.equalsIgnoreCase("par")) {
				 System.out.println("vou de IMPAR,entao");
				 
			 }else {
				 System.out.println("vou de PAR");
			 }
			
			 System.out.println("escolha um numero de 0 a 10");
			 
			 //6 se a resposta do usuario contiver um "int",prossiga
			 if (respostaUsuario.hasNextInt()) {
				 
				 //8 recuperar a resposta
				 numeroUsuario = respostaUsuario.nextInt();
				 
				 //9 gerar numero aleatorio
				 numeroMaquina = new Random().nextInt(10);
				 
				 // 10) pausar o programa por 1 segundo
				 Thread.sleep(1000);
				 
				 System.out.println("ok! escolhi o " + numeroMaquina);
				 
				 int soma = numeroUsuario + numeroMaquina;
				 System.out.println("Somando tudo deu " + soma);
				 
				 if (soma % 2 == 0 && escolhaUsuario.equalsIgnoreCase("par")){
					 System.out.println("voce venceu!");
				 } else if (soma % 2 !=0 && escolhaUsuario.equalsIgnoreCase("impar")) {
					 System.out.println("voce venceu!");
				 }else {
					 System.out.println("venci");
				 }
                 			 
				 
				 //7 agora,caso contrario,exiba msg adequada
			 }else {
				 System.out.println("Voce nao sabe brincar");
			 }
			  
			 
			 
		// 2)caso a resposta nao seja sim,nos despedimos
		}else
			System.out.println("Beleza!");
			
		}
	}


