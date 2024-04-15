package in.ashokit.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.Customer;

public class App {
	
	public static void main(String[] args) throws Exception{
		App a = new App();
		a.JsonTOJava();
	}
	
	public void JsonTOJava()throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		Customer c1 = mapper.readValue(new File("custom.json"), Customer.class);
		System.out.println(c1);
	
	}
	
	
	public void JavaToJson() throws Exception {
		
		Customer c = new Customer(101, "Vinod", 8765728l);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("custom.json"), c);
		System.out.println("Serialization completed.........");
		
		
	}

}
