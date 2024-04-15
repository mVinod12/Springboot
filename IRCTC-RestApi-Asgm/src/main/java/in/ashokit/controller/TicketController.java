package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.ashokit.entity.PassengerData;
import in.ashokit.entity.Ticket;
import in.ashokit.service.TicketService;

public class TicketController {
	
	@Autowired
    private TicketService ticketService;

    @PostMapping("/book-ticket")
    public ResponseEntity<Ticket> bookTicket(@RequestBody PassengerData passengerData) {
        Ticket ticket = ticketService.bookTicket(passengerData);
        return ResponseEntity.ok(ticket);
    }

    @GetMapping("/get-ticket/{ticketId}")
    public ResponseEntity<Ticket> getTicket(@PathVariable Long ticketId) {
        Ticket ticket = ticketService.getTicket(ticketId);
        if (ticket == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ticket);
    }

    @GetMapping("/get-all-tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> tickets = ticketService.getAllTickets();
        return ResponseEntity.ok(tickets);
    }

}
