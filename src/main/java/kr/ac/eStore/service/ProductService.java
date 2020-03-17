package kr.ac.eStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.eStore.dao.ProductDAO;
import kr.ac.eStore.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> getAllProducts() {
		
		return productDAO.getAllProducts();
	}

}
