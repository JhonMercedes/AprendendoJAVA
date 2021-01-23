package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.factory.ConnectionFactory;
import br.com.cadastro.model.User;

public class UserDAO {

	/*
	 * CRUD EM JAVA! CREATE READ UPDATE DELETE Toda regra de negocios acontece nessa
	 * classe
	 */

	public void save(User user) {

		String sql = "INSERT INTO users(username, passwd, email, dataCadastro) VALUES (?, ?, ?, ?)";

		Connection conn = null;

		PreparedStatement pstm = null;

		try {
			// criar conexao com o banco
			conn = ConnectionFactory.createConnectionToMySQL();

			// Create PreparedStatement para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// Adicionar valores esperados pela query
			pstm.setString(1, user.getUsername());
			pstm.setString(2, user.getPasswd());
			pstm.setString(3, user.getEmail());
			pstm.setDate(4, new Date(user.getDataCadastro().getTime()));

			// Execute query
			pstm.execute();
			System.out.println("Contato salvo com sucesso!!");
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public List<User> getUser(){
		
		String sql = "SELECT * FROM users";
		
		List<User> user = new ArrayList<User>();
		
		Connection conn = null; 
		PreparedStatement pstm = null;
		
		ResultSet result = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			result = pstm.executeQuery(); // retorna um array do resultado
			
			while (result.next()) { // vai percorrer os registros 
				
				User u = new User();
				// Recuperar o ID
				u.setUser_id(result.getInt("user_id"));
				u.setUsername(result.getString("username"));
				u.setPasswd(result.getString("passwd"));
				u.setEmail(result.getString("email"));
				u.setDataCadastro(result.getDate("dataCadastro"));
				
				user.add(u);
				System.out.println(sql);
				
				}
			}catch (Exception e){
				e.printStackTrace();
				}finally {
					try {
						if (result != null) {
							result.close();
						}
						if (pstm != null) {
							pstm.close();
						}
						if (conn != null) { 
							conn.close();
						}
					}catch (Exception e) {
							e.printStackTrace();
					}
				}	
				return user;
		}
	}