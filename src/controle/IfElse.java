package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String ValorString = JOptionPane.showInputDialog("Informe o valor:");
		int ValorInt = Integer.parseInt(ValorString);
		
		if (ValorInt % 2 == 0) {
			System.out.println("N�MERO PAR!");
		} else {
			System.out.println("N�MERO �MPAR!");
		}
		
	}
}
