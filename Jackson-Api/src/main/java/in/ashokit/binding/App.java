package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	
	public static void main(String [] args) throws Exception{
		App a = new App();	
		a.JsonToJava();
	}
	
	public void JsonToJava() throws Exception {
		//convert json to java
		
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(new File("customer.json"), Customer.class);
		System.out.println(c);
	}
	
	public void JavaToJson() throws Exception{
		
		Customer c = new Customer(101, "Vinod", 78923883L);
		
		//convert Java to Json
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Serialization completed");
	}

}
