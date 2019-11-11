package br.edu.utfpr.model.service;

import java.util.ArrayList;
import java.util.List;
import br.edu.utfpr.model.TicketOrder;
import br.edu.utfpr.model.User;
import br.edu.utfpr.model.dao.TicketOrderDAO;
import br.edu.utfpr.model.dao.UserDAO;

public class TicketOrderService  extends AbstractService<Long, TicketOrder>{
   private UserDAO user;
   private TicketOrderDAO t;
   
   public TicketOrderService(){   
	   
       dao = new TicketOrderDAO();
   }
   public List<TicketOrder> findByUserRequestsParam(Long id){
   	return t.findByUserRequestsParam(id);
   }
   
}
