package br.com.cadastro.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME = "root"; // nome do usu�rio - MYSQL
	private static final String PASSWORD = "root"; // senha do BD

	// Caminho do banco, porta e o nome do banco criado
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Cadastro";

	/*
	 * Conex�o com o banco de dados
	 */
	public static Connection createConnectionToMySQL() throws Exception {
		// Classe carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Cria a conex�o com o banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws Exception {

		// Recuperar conexao com o banco
		Connection con = createConnectionToMySQL();

		// Testar conex�o nula
		if (con != null) {
			System.out.println("Conex�o obtida com sucesso");
			con.close();
		}
	}

}
