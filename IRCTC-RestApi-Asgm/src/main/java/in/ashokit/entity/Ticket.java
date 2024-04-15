package in.ashokit.entity;

import java.sql.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Ticket {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private String name;
    private Date dob;
    private String gender;
    private Date doj;
    private String from;
    private String to;
    private String trainNum;
    private String ticketStatus = "booked"; //Default status
    
    public Ticket() {
    	
    }
    
    
	public Ticket(Long ticketId, String name, Date dob, String gender, Date doj, String from, String to,
			String trainNum, String ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.doj = doj;
		this.from = from;
		this.to = to;
		this.trainNum = trainNum;
		this.ticketStatus = ticketStatus;
	}


	public Long getTicketId() {
		return ticketId;
	}
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
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
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", doj="
				+ doj + ", from=" + from + ", to=" + to + ", trainNum=" + trainNum + ", ticketStatus=" + ticketStatus
				+ "]";
	}
    
    

}
