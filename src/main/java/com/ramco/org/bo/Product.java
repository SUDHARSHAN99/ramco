/**
 * 
 */
package com.ramco.org.bo;

/**
 * @author sudharshanreddy
 *
 */

public class Product {

	private Long id;
	private String productId;
	private String customerId;
	private String itemDescription;
	private String category;
	private String categoryCode;
	private float price;
	private int quantity;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", productId=" + productId + ", customerId=" + customerId + ", itemDescription="
				+ itemDescription + ", category=" + category + ", categoryCode=" + categoryCode + ", price=" + price
				+ "]";
	}
	
}
