package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		String Dia = Scanner.next();
		
		if ("domingo".equals(Dia.toLowerCase())) {
			System.out.println("Dia de n�mero 1");
		} else if ("segunda".equals(Dia.toLowerCase())) {
			System.out.println("Dia de n�mero 2");
		} else if ("ter�a".equals(Dia.toLowerCase())) {
			System.out.println("Dia de n�mero 3");
		} else if ("quarta".equals(Dia.toLowerCase())) {
			System.out.println("Dia de n�mero 4");
		} else if ("quinta".equals(Dia.toLowerCase())) {
			System.out.println("Dia de n�mero 5");
		} else if ("sexta".equals(Dia.toLowerCase())) {
			System.out.println("Dia de n�mero 6");
		} else if ("s�bado".equals(Dia.toLowerCase()) || "sabado".equals(Dia.toLowerCase())) {
			System.out.println("Dia de n�mero 7");
		} else {
			System.out.println("Dia inv�lido!");
		}
		
		System.out.println("Fim!");
		
		Scanner.close();
		
	}
}
