package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.response.Product;

@Service
public class ProductsService {
	
	
	public Product getProducts(String productId) {
		String apiUrl = "https://api.restful-api.dev/objects/" + productId;
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Product> resEntity = rt.getForEntity(apiUrl, Product.class);
		int status = resEntity.getStatusCode().value();
		if(status == 200) {
			return resEntity.getBody();
			
		}
		
		return null;
	}
	
	public void getProducts() {
		
		String apiUrl = "https://api.restful-api.dev/objects";
		
		RestTemplate rt = new RestTemplate();
		 ResponseEntity<Product[]> resEntity = rt.getForEntity(apiUrl, Product[].class);
		 int value = resEntity.getStatusCode().value();
		if(value == 200) {
			Product[] products = resEntity.getBody();
			for(Product p : products) {
				System.out.println(p);
			}
				
		}
	
				
	}

}
