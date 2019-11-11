package br.edu.utfpr.model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import br.edu.utfpr.model.Show;

public class ShowDAO extends AbstractDAO<Long, Show>{
	
	public ShowDAO() {
        super();
    }
	public List<Show> findAllQtd(int init, int limit){
			
			entityManager.getTransaction().begin();		
			Show show = entityManager.find(Show.class, 33);		
			entityManager.getTransaction().commit();
			entityManager.close();
			
			
			String consulta = "SELECT  SUM(t.amount), t.show FROM TicketOrder t GROUP BY t.show";
			TypedQuery<Show> query = 
			entityManager.createQuery(consulta, Show.class);
			query.setMaxResults(limit);
			query.setFirstResult(init);
			return query.getResultList();		
		}
}
