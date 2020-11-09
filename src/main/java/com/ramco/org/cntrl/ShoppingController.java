/**
 * 
 */
package com.ramco.org.cntrl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ramco.org.bo.Product;
import com.ramco.org.service.CartService;

/**
 * @author sudharshanreddy
 *
 */
@RestController
public class ShoppingController {
	
	private CartService cartServiceImpl;
	
	@RequestMapping(value = "/ramco/add-cart", method = RequestMethod.POST,
		      produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> addCart(@ModelAttribute Product product) {
		cartServiceImpl.addToCart(product);
		return ResponseEntity.ok("success");
	}
	
	@RequestMapping(value = "/ramco/delete/{id}", method = RequestMethod.POST,
		      produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> deleteFromCart(@RequestBody String request) {
		
		return ResponseEntity.ok("success");
	}
	
	@RequestMapping(value = "/ramco/buy-now", method = RequestMethod.POST,
		      produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> buyNow(@RequestBody String request) {
		
		return ResponseEntity.ok("success");
	}
	
	@RequestMapping(value = "/ramco/add-address", method = RequestMethod.POST,
		      produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> addAddress(@RequestBody String request) {
		
		return ResponseEntity.ok("success");
	}
	
	

}
