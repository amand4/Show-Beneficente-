package br.edu.utfpr.model.dto;

import java.sql.Date;

import br.edu.utfpr.model.Show;

public class ShowDTO {
	private Long id;
	private Date date;
	private String band;
	
	public ShowDTO() {
		// TODO Auto-generated constructor stub
	}
	public ShowDTO(Long id, Date date, String band) {
		this.id = id;
		this.date = date;
		this.band = band;
	}
	
	public ShowDTO(Show show) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	
}
