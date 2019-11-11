package br.edu.utfpr.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name = "local_event")
	public class LocalEvent {
	    @Id
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "start_date")
	    private Date startDate;

	    @Column(name = "end_date")
	    private Date endDate;

		@Column(name = "city")
	    private String city;
		
		@OneToMany
		private Set<Show> shows; 
		
		public LocalEvent() {
			super();
		} 
		
	    public LocalEvent(Long id, Date startDate, Date endDate, String city) {
			this.id = id; 
			this.startDate = startDate;
			this.endDate = endDate;
			this.city = city;
			this.shows = new HashSet<Show>();
		}
	    
	    public void insertShow(Show show){
	    	this.shows.add(show);
	    }
	    @Override
		public String toString() {
			return "Local do Evento: [id=" + id + ", city=" + city + ", show=" + shows
					+ "]";
		}

}
