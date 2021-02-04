package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		// "Supplier" n�o recebe nenhum par�metro e retorna qualquer tipo
		Supplier<List<String>> umaLista = () -> 
			Arrays.asList("Ana", "Bia", "Gui", "Lia");
		
		System.out.println(umaLista.get());
	}
}
