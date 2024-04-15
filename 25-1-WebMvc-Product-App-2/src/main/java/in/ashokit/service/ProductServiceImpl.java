package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean saveProduct(Product p) {
		Product savedProduct=productRepo.save(p);
			return savedProduct.getPid()!=null;
		}
	

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

}
