package br.edu.utfpr.model.service;

import br.edu.utfpr.model.Show;
import br.edu.utfpr.model.dao.ShowDAO;

public class ShowService extends AbstractService<Long, Show>{
    
   public ShowService(){        
       dao = new ShowDAO();
   } 
   

}
