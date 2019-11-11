package br.edu.utfpr.model.service;

import br.edu.utfpr.model.User;
import br.edu.utfpr.model.dao.UserDAO;

public class UserService  extends AbstractService<Long, User>{

	 public UserService(){        
	        dao = new UserDAO();
	    }  
}
