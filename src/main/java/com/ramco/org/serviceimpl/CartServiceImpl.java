/**
 * 
 */
package com.ramco.org.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramco.org.bo.Product;
import com.ramco.org.entity.CartEntity;
import com.ramco.org.repository.CartRepository;
import com.ramco.org.service.CartService;
import com.ramco.org.service.ProductService;

/**
 * @author sudharshanreddy
 *
 */
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private ProductService productServiceImpl;
	
	@Override
	public boolean addToCart(Product product) {
		if(product != null) {
			CartEntity cartEntity = new CartEntity();
			productServiceImpl.addProduct(product);
			buildCart(product, cartEntity);
			cartRepo.save(cartEntity);
		}
		return false;
	}


	private void buildCart(Product product, CartEntity cart) {
		cart.setItemId(product.getProductId());
		cart.setQuantity(1);
		cart.setTotalCost(product.getPrice() * product.getQuantity());
	}

	@Override
	public boolean deleteFromCart(String itemId) {
		return false;
	}

	@Override
	public List<Product> getAllItems(String customerId) {
		return null;
	}

}
