package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
