package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	// Mostrando que � poss�vel a cria��o de par�metros gen�ricos
	public static <A, B, C> C getUltimo2(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
