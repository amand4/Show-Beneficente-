package br.edu.utfpr.model.dao;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import br.edu.utfpr.model.TicketOrder;
import br.edu.utfpr.model.User;
import java.util.List;


public class TicketOrderDAO extends AbstractDAO<Long, TicketOrder> {
	public TicketOrderDAO() {
        super();
    }	
	public List<TicketOrder> findByUserRequestsParam(Long id){
		Query q = entityManager.createQuery("SELECT t FROM TicketOrder t WHERE user.id = ?");
				return q.getResultList();
	}
}
