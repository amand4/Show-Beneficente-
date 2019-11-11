package br.edu.utfpr.model.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.edu.utfpr.model.User;

public class UserDAO extends AbstractDAO<Long, User> {
	public UserDAO() {
        super();
    }	
	public List<User> findAllOrdered() {
		Query q = entityManager.createQuery("SELECT u FROM User u ORDER BY u.name");
		return q.getResultList();		
	}
	
	public List<User> findAll(int init, int limit){
		
		entityManager.getTransaction().begin();		
		User user = entityManager.find(User.class, 33);		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
		String consulta = "SELECT u FROM User u";
		TypedQuery<User> query = 
		entityManager.createQuery(consulta, User.class);
		query.setMaxResults(limit);
		query.setFirstResult(init);
		return query.getResultList();		
	}
}
