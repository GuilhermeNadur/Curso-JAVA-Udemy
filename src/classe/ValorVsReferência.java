package classe;

public class ValorVsRefer�ncia {

	public static void main(String[] args) {
		
		double A = 5;
		double B = A; // Atribui��o por VALOR (Primitivo)
		
		A++;
		B--;
		
		System.out.println(A);
		System.out.println(B);
		
		int E = 5;
		
		alterarPrimitivo(E);
		
		System.out.println(E); // Valores primitivos n�o sofrem altera��o
		
		Data C = new Data(15, 07, 2000);
		Data D = C; // Atribui��o por REFER�NCIA (Objeto)
		
		C.dia = 16;
		D.mes = 10;
		
		System.out.println(C.dataFormatada());
		System.out.println(D.dataFormatada());
		
		voltarDataValorPadrao(C);
		
		System.out.println(C.dataFormatada()); // Objetos sofrem altera��o
		System.out.println(D.dataFormatada()); // Objetos sofrem altera��o
	}
	
	static void voltarDataValorPadrao(Data A) {
		A.dia = 1;
		A.mes = 1;
		A.ano = 1970;
	}
	
	static void alterarPrimitivo(int A) {
		A++;
	}
}
