package br.edu.utfpr;

import java.io.IOException;
import java.sql.Date;
import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.utfpr.model.Show;
import br.edu.utfpr.model.TicketOrder;
import br.edu.utfpr.model.User;
import br.edu.utfpr.model.dto.ShowDTO;
import br.edu.utfpr.model.LocalEvent;
import br.edu.utfpr.model.service.LocalEventService;
import br.edu.utfpr.model.service.ShowService;
import br.edu.utfpr.model.service.TicketOrderService;
import br.edu.utfpr.model.service.UserService;

/**
 * Servlet implementation class CriarBDServlet
 */
@WebServlet("/criar")
public class CriarBDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public CriarBDServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		criarBD();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		criarBD();
	}
	
	private void criarBD(){				
		
		User user1 = new User(1L,"Amanda", 18);
		User user2 = new User(2L,"Eduarda", 20);
		User user3 = new User(3L,"Ana", 24);
		
		UserService userService = new UserService();
		userService.save(user1);
		userService.save(user2);
		userService.save(user3);
		
		Show show1 = new Show(2L, new Date(0), "Sandy e Junior");
		Show show2 = new Show(2L, new Date(0), "Matuê");
		Show show3 = new Show(2L, new Date(0), "Djonga");

	    ShowService showService = new ShowService();
	    showService.save(show1);  
	    showService.save(show3);  
	    showService.save(show2);  

	    LocalEventService localEventService = new LocalEventService();
	    LocalEvent local1 = new LocalEvent(1L, new Date(19), new Date(19), "São Paulo");
        local1.insertShow(show1);
        localEventService.save(local1);
        
        LocalEvent local2 = new LocalEvent(2L, new Date(20), new Date(20), "Curitiba");
        local2.insertShow(show3);
        local2.insertShow(show2);
        localEventService.save(local2);
	      
        TicketOrderService tick = new TicketOrderService();
        TicketOrder tickt1 = new TicketOrder(1L, 15, 2.0, user1, show1);
        TicketOrder tickt3 = new TicketOrder(3L, 7, 399.0, user2, show3);
        TicketOrder tickt4 = new TicketOrder(4L, 2, 100.0, user3, show2);
        
        tick.save(tickt1);
        tick.save(tickt3);
        tick.save(tickt4);



	}	
}
