package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
