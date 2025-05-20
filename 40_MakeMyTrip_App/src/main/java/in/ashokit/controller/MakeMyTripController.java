package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Passenger;
import in.ashokit.service.MakeMytripService;
import reactor.core.publisher.Mono;

@RestController
public class MakeMyTripController {
	
	@Autowired
	private MakeMytripService service;
	
	 // Load Form to Book Ticket
    @GetMapping("/bookTicketForm")
    public String showBookTicketForm(Model model) {
        model.addAttribute("passenger", new Passenger());
        return "bookTicketForm"; // Return the name of your HTML form template
    }
    
    @PostMapping("/bookTicket")
    public Mono<String> bookTicket( Passenger passenger,Model model) {
        return service.bookTicket(passenger)
        		.map(ticket -> {
                    model.addAttribute("ticket", ticket);
                    return "bookTicketForm";
                }); // Redirect to tickets page after booking
    }
    
    @GetMapping("/tickets")
    public Mono<String> getAllTickets(Model model) {
        return service.getAllTickets()
                .map(tickets -> {
                    model.addAttribute("tickets", tickets);
                    return "tickets"; // Return the name of your HTML tickets template
                });
    }
    }
