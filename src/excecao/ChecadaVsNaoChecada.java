package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) throws Exception {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		geraErro2();
		
		System.out.println("Fim!");
	}
	
	// Exce��o N�O checada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #1");
	}
	
	// Exce��o checada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #2");
	}
}
