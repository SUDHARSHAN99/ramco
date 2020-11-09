/**
 * 
 */
package com.ramco.org.service;

import java.util.List;

import com.ramco.org.bo.Product;

/**
 * @author sudharshanreddy
 *
 */
public interface CartService {
	
	boolean addToCart(Product item);
	boolean deleteFromCart(String itemId);
	List<Product> getAllItems(String customerId);

}
