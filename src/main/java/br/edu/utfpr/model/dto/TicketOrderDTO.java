package br.edu.utfpr.model.dto;

import br.edu.utfpr.model.Show;
import br.edu.utfpr.model.TicketOrder;
import br.edu.utfpr.model.User;

public class TicketOrderDTO {
	private long id;
	
	private int amount;
	
	private double donationValue;
	
	private Show show;
	
	private User user;
	
	public TicketOrderDTO(Long id, int amount, double donationValue, User user, Show show) {
		this.id = id;
		this.amount = amount;
		this.donationValue = donationValue;
		this.user = user;
		this.show = show;
	}
	
	public TicketOrderDTO(TicketOrder ticketOrder) {
		this.id = id;
		this.amount = amount;
		this.donationValue = donationValue;
		this.user = user;
		this.show = show;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getDonationValue() {
		return donationValue;
	}

	public void setDonationValue(double donationValue) {
		this.donationValue = donationValue;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
