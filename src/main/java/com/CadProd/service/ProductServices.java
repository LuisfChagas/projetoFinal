package com.CadProd.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CadProd.repository.ProductRepository;
import com.CadProd.models.*;

@Service
@Transactional
public class ProductServices {
	@Autowired
	private ProductRepository repo;
	
	public List<ProductsModel> listAll(){
		return repo.findAll();
	}
	
	public ProductsModel get(int id) {
		return repo.findById(id).get();
	}
	public void save(ProductsModel product) {
		repo.save(product);
	}
	public void delete(int id) {
		repo.deleteById(id);
	}
}
