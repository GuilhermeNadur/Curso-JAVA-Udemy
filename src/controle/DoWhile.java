package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		String A = "";
		
		do {
			System.out.println("Voc� precisa escrever as palavras m�gicas...");
			System.out.print("Voc� deseja sair? ");
			A = Scan.nextLine();
		} while (!A.equalsIgnoreCase("por favor"));

		System.out.println("Encerrando...");
		
		Scan.close();
		
	}
}
