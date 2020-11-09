/**
 * 
 */
package com.ramco.org.bo;

/**
 * @author sudharshanreddy
 *
 */
public class Cart {
	
	private Long id;
	
	private String itemId;
	
	private String orderId;
	
	private int quantity;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", itemId=" + itemId + ", orderId=" + orderId + ", quantity=" + quantity + "]";
	}

}
