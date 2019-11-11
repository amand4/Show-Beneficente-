package br.edu.utfpr.model.dao;

import br.edu.utfpr.model.Show;

public class AmountShowTicketsDAO {

	private Long qtd;
	private Show show;
	
	public AmountShowTicketsDAO(Long qtd, Show show) {
		super();
		this.qtd = qtd;
		this.show = show;
	}

	public Long getQtd() {
		return qtd;
	}

	public void setQtd(Long quant) {
		this.qtd = quant;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}
	
}
