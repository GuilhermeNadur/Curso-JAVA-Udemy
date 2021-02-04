package fundamentos;

public class Convers�es1 {

	public static void main(String[] args) {
		
		// Convers�o Expl�cita (CAST)
		float A = (float) 1.12345678910;
		System.out.println(A);
		
		// Convers�o Impl�cita
		double B = 1;
		System.out.println(B);
		
		// Convers�o Expl�cita (CAST)
		int C = 300;
		byte D = (byte) C;
		System.out.println(D);
		
		// Convers�o Expl�cita (CAST)
		double F = 1;
		int G = (int) F;
		System.out.println(G);
		
		// Convers�o int, Integer... -> String
		Integer H = 10000;
		System.out.println(H.toString().length());
		
		int I = 10000;
		System.out.println(Integer.toString(I).length());
		
	}
}
