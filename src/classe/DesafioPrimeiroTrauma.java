package classe;

public class DesafioPrimeiroTrauma {

	int A = 5; // Atributo n�o pertencente a classe pela aus�ncia do "static"
	static int B = 3;
	
	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma Obj = new DesafioPrimeiroTrauma(); // Objeto "Obj" criado para
															   //   trazer o valor de "A"
		
		System.out.println(Obj.A);
		System.out.println(B);
		
	}
}
