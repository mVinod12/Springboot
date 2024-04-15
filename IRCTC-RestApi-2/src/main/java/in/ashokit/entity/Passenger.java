package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private LocalDate doj;
	private String gender;
	
	public Passenger() {
		
	}

	public Passenger(Long id, String name, LocalDate doj, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", doj=" + doj + ", gender=" + gender + "]";
	}

	
	
	 
       	

}
