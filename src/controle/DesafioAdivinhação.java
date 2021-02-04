package controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinha��o {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int numeroSorteado = gerador.nextInt(101);
		int numero = 0;
		int decisao1 = 0;
		int win = 0;
		int tentativas = 10;

		System.out.println("       JOGO DA ADIVINHA��O (0 - 100)     ");
		System.out.println("=========================================");
		System.out.println("[1] INICIAR");
		System.out.println("[2] COMO JOGAR");
		System.out.println("[3] SOBRE O JOGO");
		System.out.println("[4] SAIR");
		System.out.print("Op��o: ");
		decisao1 = Scan.nextInt();
		
		fim:
		switch (decisao1) {
		
		case 1:
			System.out.println("\nCOME�OU!");
			System.out.printf("Tentativas restantes: " + tentativas + "\n");
			
			while (win != 1 && tentativas > 0) {
				System.out.print("Digite um n�mero: ");
				numero = Scan.nextInt();
				
				if (numero == numeroSorteado) {
					System.out.println("\nPARAB�NS, VOC� ACERTOU!");
					win = 1;
					break fim;
					
				} else if (numero < numeroSorteado) {
					--tentativas;
					System.out.println("\nEste n�mero est� ABAIXO do n�mero correto!");
					System.out.printf("Tentativas restantes: " + tentativas + "\n");
					
				} else if (numero > numeroSorteado) {
					--tentativas;
					System.out.println("\nEste n�mero est� ACIMA do n�mero correto!");
					System.out.printf("Tentativas restantes: " + tentativas + "\n");
				}
			} 
			System.out.println("\nAcabaram as suas tentativas! :(");
			break;
			
		case 2:
			for (int i = 0; i < 50; ++i) System.out.println ();
			System.out.println("ANDAM DIZENDO POR A� QUE O TU� � O DEM�NIO!");
			for (int i = 0; i < 34; ++i) System.out.println ();
			break;
			
		case 3:
			for (int i = 0; i < 50; ++i) System.out.println ();
			System.out.println("Criado por: GUILHERME RODRIGUES NADUR");
			System.out.println("Com ajuda de: NINGU�M");
			System.out.println("Para que a humanidade: CHUPE MEU PINTO AT� EU GOZAR");
			System.out.println("Guilherme gosta que cospe?: false");
			System.out.println("Guilherme gosta que engole?: true");
			for (int i = 0; i < 30; ++i) System.out.println ();
			break;
			
		case 4:
			System.out.println("Encerrando...");
			for (int i = 0; i < 50; ++i) System.out.println ();
			break;
			
		default:
			System.out.println("Op��o inv�lida!");
		}
		
		Scan.close();
		
	}
	
}
