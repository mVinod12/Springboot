package in.ashokit.filter;

import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter{
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
		
		System.out.println("Filter( ) executed....");

	ServerHttpRequest request = exchange.getRequest();
	HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		
		//Validate the request
		if(!keySet.contains("secret")) {
			throw new RuntimeException("Invalid request");
		}
		
		List<String> list = headers.get("secret");
		if(!list.get(0).equals("ashokit@123")) {
			throw new RuntimeException("Invalid token");
		}
		
		
		
	return chain.filter(exchange);
	}
	
	
	}


