package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue
	private Long ticketId;
	private String ticketStatus;
	private String trainName;
	private String from;
	private String to;
	private LocalDate doj;
	
	public Ticket() {
		
	}
	
	public Ticket(Long ticketId, String ticketStatus, String trainName, String from, String to, LocalDate doj) {
		super();
		this.ticketId = ticketId;
		this.ticketStatus = ticketStatus;
		this.trainName = trainName;
		this.from = from;
		this.to = to;
		this.doj = doj;
	}

	public Long getTicketId() {
		return ticketId;
	}
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
	
	

}
