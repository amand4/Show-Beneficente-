package br.edu.utfpr.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "shows")
	public class Show {
		@Id
	    @Column(name = "id")
		private Long id;
		
	    @Column(name = "date")
		private Date date;
	    
	    @Column(name = "band")
		private String band;

		private Long quant;

		private Show show;
	       
	    public Show() {
	    	super();
	    }

		public Show(Long id, Date date, String band) {
			super();
			this.id = id;
			this.date = date;
			this.band = band;
		}
		public Show(Long quant, Show show) {
			super();
			this.quant = quant;
			this.show = show;
		}
		@Override
		public String toString() {
			return "Show [id=" + id + ", band=" + band + ", show=" + show
					+  "]";
		}
	 

}
