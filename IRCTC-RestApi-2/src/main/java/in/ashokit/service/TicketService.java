package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Passenger;
import in.ashokit.entity.Ticket;
import in.ashokit.repo.PassengerRepository;
import in.ashokit.repo.TicketRepository;

@Service
public class TicketService {
	
	private final TicketRepository ticketRepository;
    private final PassengerRepository passengerRepository;

    public TicketService(TicketRepository ticketRepository, PassengerRepository passengerRepository) {
        this.ticketRepository = ticketRepository;
        this.passengerRepository = passengerRepository;
    }

	
	public Ticket bookTicket(Passenger passenger) {
        // Assuming ticketStatus is initially set to "Booked"
        Ticket ticket = new Ticket("Booked", passenger.getTrainNum(), passenger.getFrom(), passenger.getTo(), passenger.getDoj());
        // You may add more logic here such as validating input, checking seat availability, etc.
        Passenger savedPassenger = passengerRepository.save(passenger);
        ticket.setPassenger(savedPassenger);
        return ticketRepository.save(ticket);
    }   
	
	public Ticket getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId)
                .orElseThrow(() -> new RuntimeException("Ticket not found with id: " + ticketId));
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }


   

}
