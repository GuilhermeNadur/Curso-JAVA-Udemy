package fundamentos;

import javax.swing.JOptionPane;

public class Convers�es2 {

	public static void main(String[] args) {
		
		// Convers�o String -> int, Integer...
		String V1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
		String V2 = JOptionPane.showInputDialog("Digite o segundo valor:");
		
		System.out.println(V1 + V2);
		
		double N1 = Double.parseDouble(V1);
		double N2 = Double.parseDouble(V2);
		
		double S = N1 + N2;
		
		System.out.println("A Soma �: " + S);
		System.out.println("A M�dia �: " + S / 2);
		
	}
}
