package br.edu.utfpr.model.service;

import br.edu.utfpr.model.LocalEvent;
import br.edu.utfpr.model.dao.LocalEventDAO;

public class LocalEventService extends AbstractService<Long, LocalEvent>{
    
   public LocalEventService(){        
       dao = new LocalEventDAO();
   } 
	
}
