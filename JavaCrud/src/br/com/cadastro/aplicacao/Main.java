package br.com.cadastro.aplicacao;

import java.util.Date;

import br.com.cadastro.dao.UserDAO;
import br.com.cadastro.model.User;

public class Main {

	public static void main(String[] args) {
		
		UserDAO userDao = new UserDAO();
		
		User user = new User();
		user.setUsername("Virgina");
		user.setPasswd("mun123");
		user.setEmail("sememail@corporavito.com.br");
		user.setDataCadastro(new Date());
		
		userDao.save(user);
		
	}
}
