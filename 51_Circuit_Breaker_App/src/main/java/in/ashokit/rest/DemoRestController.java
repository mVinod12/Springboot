package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DemoRestController {
	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDb",name="ashokit")
	public String getDataFromRedis() {
		System.out.println("Redis() Method.......Executed..");
		
		int i = 10/0;
		
		// logic for redis
		return "Fetch Data from redis";
	}
	
	public String getDataFromDb(Throwable t) {
		System.out.println("DB() method.... Executed..");
		
		//logic for DB
		
		return "Fetch Data from DB";
	}

}
