package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.PassengerData;
import in.ashokit.entity.Ticket;
import in.ashokit.repo.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	public Ticket bookTicket(PassengerData passengerData) {
        Ticket ticket = new Ticket();
        ticket.setName(passengerData.getName());
        ticket.setDob(passengerData.getDob());
        ticket.setGender(passengerData.getGender());
        ticket.setDoj(passengerData.getDoj());
        ticket.setFrom(passengerData.getFrom());
        ticket.setTo(passengerData.getTo());
        ticket.setTrainNum(passengerData.getTrainNum());

        return ticketRepository.save(ticket);
    }
	
	public Ticket getTicket(Long ticketId) {
        return ticketRepository.findById(ticketId).orElse(null);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

}
