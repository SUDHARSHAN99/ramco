/**
 * 
 */
package com.ramco.org.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramco.org.bo.Product;
import com.ramco.org.entity.ProductEntity;
import com.ramco.org.repository.ProductRepository;
import com.ramco.org.service.ProductService;

/**
 * @author sudharshanreddy
 *
 */
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository prodRepository;
	
	@Override
	public Product addProduct(Product product) {
		ProductEntity productEntity =  new ProductEntity();
		buildProduct(product, productEntity);
		prodRepository.save(productEntity);
		return null;
	}

	@Override
	public boolean deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void buildProduct(Product product, ProductEntity productEntity) {
		productEntity.setCustomerId(product.getCustomerId());
		productEntity.setProductId(product.getProductId());
		productEntity.setPrice(product.getPrice());
		productEntity.setCategory(product.getCategory());
		productEntity.setCategoryCode(product.getCategoryCode());
		
	}

}
