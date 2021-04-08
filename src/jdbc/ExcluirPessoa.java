package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o c�digo: ");
		int codigo = sc.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String deleteSQL = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(deleteSQL);
		stmt.setInt(1, codigo);
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa exclu�da com sucesso!");
		} else {
			System.out.println("N�o foi poss�vel exluir!");
		}
		
		sc.close();
		conexao.close();
	}
}
