/**
 * 
 */
package com.ramco.org.service;

import com.ramco.org.bo.Product;

/**
 * @author sudharshanreddy
 *
 */
public interface ProductService {
	
	Product addProduct(Product product);
	boolean deleteProduct(String productId);

}
