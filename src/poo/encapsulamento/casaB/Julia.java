package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		
		Ana sogra = new Ana();
		
//		segredo
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem
		
//		System.out.println(sogra.segredo); // n�o foi poss�vel acessar atributos "private"
//		System.out.println(sogra.facoDentroDeCasa); // n�o foi poss�vel acessar atributos "default" (package)
//		System.out.println(sogra.formaDeFalar); // n�o foi poss�vel acessar atributos "protected"
		System.out.println(sogra.todosSabem);
	}
	
}
