package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeAcessos() {
		
//		segredo
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
//		System.out.println(segredo); // n�o foi poss�vel acessar atributos "private"
//		System.out.println(facoDentroDeCasa); // n�o foi poss�vel acessar atributos "default" (package)
		System.out.println(formaDeFalar); 
		System.out.println(todosSabem);
	}
	
}
