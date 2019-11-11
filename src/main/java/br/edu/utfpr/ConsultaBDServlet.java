package br.edu.utfpr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.utfpr.model.Show;
import br.edu.utfpr.model.TicketOrder;
import br.edu.utfpr.model.User;
import br.edu.utfpr.model.dao.AmountShowTicketsDAO;
import br.edu.utfpr.model.dao.TicketOrderDAO;
import br.edu.utfpr.model.dto.TicketOrderDTO;
import br.edu.utfpr.model.service.ShowService;
import br.edu.utfpr.model.service.TicketOrderService;

@WebServlet("/consultar")
public class ConsultaBDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		consultaBD();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		consultaBD();
	}
	
	private void consultaBD(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shows");
		EntityManager em = emf.createEntityManager();

	  //	Apresentar todos usuários cadastrados
		System.out.println("Lista de todos os Usuários:");
		Query q = em.createQuery("SELECT u FROM User u ORDER BY u.name");
		List<User> listUsers = q.getResultList();
		for (User user : listUsers) {
		} 
		System.out.println("Total: " + listUsers.size());
		System.out.println("-------------------------------------\n");
		
	
		//Apresentar os pedidos de ingressos de um dado usuário.
	    System.out.println("Lista de dado usuario ");
		q = em.createQuery("SELECT t FROM TicketOrder t WHERE user.name = 'Amanda' ");
		List<TicketOrder> lista2 = q.getResultList();

		for (TicketOrder ticketOrder : lista2) {
			System.out.println(ticketOrder);
		}
		System.out.println("-------------------------------------\n");
		

		//Apresentar os usuários que compraram ingressos para um dado show
	    System.out.println("Lista de usuarios que compraram ingressos para o show Sandy e Junior");
		 q = em.createQuery("select ticket.user from TicketOrder ticket where ticket.show.id=2 ");
		List<User> lista3 = q.getResultList();

		for (User ticketOrder3 : lista3) {
			System.out.println("User:"+ticketOrder3);
		}
		System.out.println("-------------------------------------\n");

		//Apresentar o usuário que doou o maior valor em um pedido
		System.out.println("Usuario que doou  maior valor");
		 q = em.createQuery("select t.user_id from ticket_order t WHERE t.donation_value = (SELECT MAX(b.donation_value) from ticket_order b)");
		List<User> lista4 = q.getResultList();

		for (User ticketOrder4 : lista4) {
			System.out.println("User"+ticketOrder4);
		}
		System.out.println("-------------------------------------\n");

		
		
		//Apresentar a quantidade de ingressos vendidos para cada show
//		System.out.println("Lista de  quantidade de ingresso vendido");
//		 q = em.createQuery("SELECT  SUM(t.amount), t.show FROM TicketOrder t GROUP BY t.show");
//		List<AmountShowTicketsDAO> lista5 = q.getResultList();
//
//		for (AmountShowTicketsDAO ticketOrder5 : lista5) {
//			System.out.println("Show :" + AmountShowTicketsDAO.getShow().getName()
//					+ "Quantidade: " + AmountShowTicketsDAO.getQtd()  );
//	}
//		System.out.println("Total de alunos: " + lista5.size());
//		System.out.println("-------------------------------------\n");

		em.close();
		emf.close();
		
	}

}
