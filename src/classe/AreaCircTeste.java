package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		// Criando um objeto e definindo obrigatoriamente (por conta do construtor)
		//   o valor de raio
		AreaCirc A1 = new AreaCirc(100);
		// Obtendo a �rea da circunfer�ncia com o objeto acessando o m�todo "default"
		System.out.println(A1.area());
		
		// Obtendo a �rea da circunfer�ncia acessando o m�todo "static" 
		//   e definindo o valor de raio
		System.out.println(AreaCirc.area(100));
		
	}
}
