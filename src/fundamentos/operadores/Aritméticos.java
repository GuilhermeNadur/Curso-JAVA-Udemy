package fundamentos.operadores;

public class Aritm�ticos {

	public static void main(String[] args) {
		
		var X = 8;
		var Y = 3;
		
		System.out.println(X / Y);
		System.out.println(X / (double) Y);
		System.out.println(X / (float) Y);
		
		int Z = 2 + 3 + 5;
		int W = (int) Math.pow(Z, 5); // ou definir a vari�vel como "double"
		
		System.out.println(W);
		
		
		// Desafio Aritm�tico:
		
		double A = 1 - 5;
		double B = 2 - 7;
		double C = 3 + 2;
		double D = 3 * 2;
		double E = Math.pow(10, 3);
		
		double R = Math.pow((Math.pow((6 * (C)), 2) / D -
					(Math.pow(((A) * (B) / 2), 2))), 3) / E;
		
		System.out.println("O resultado do Desafio Aritm�tico �: " + (int) R);
		
	}
}
