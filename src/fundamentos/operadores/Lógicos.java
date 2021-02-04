package fundamentos.operadores;

public class L�gicos {

	public static void main(String[] args) {
		
		boolean C1 = true;
		boolean C2 = 3 > 5;
		
		System.out.println(C1 && C2); // (AND)
		System.out.println(C1 || C2); // (OR)
		System.out.println(C1 ^ C2);  // (XOR)
		
		System.out.println("\nTABELA VERDADE DO AND");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTABELA VERDADE DO OR");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTABELA VERDADE DO XOR");
		System.out.println(true ^ true);
	    System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTABELA VERDADE DO NOT");
		System.out.println(!true);
		System.out.println(!false);
		
		
		// Desafio L�gico:
		
		boolean A = true;
		boolean B = true;
		
		if (A && B == true) {
			System.out.println("\nEnt�o vamos tomar sorvete e comprar uma TV de"
					           + " 50 polegadas, fam�lia!");
		} else {
			if (A ^ B == true) {
				System.out.println("\nEnt�o vamos comprar uma TV de 32 polegadas, fam�lia!");
			} else {
				System.out.println("\nInfelizmente n�o vamos sair hoje, fam�lia!");
			}
		}
		
		
	}
}
