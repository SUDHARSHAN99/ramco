/**
 * 
 */
package com.ramco.org.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author sudharshanreddy
 *
 */
@Entity
@Table(name = "product")
@NamedQuery(name = "Product.findAll", query = "SELECT l FROM Product l")
public class ProductEntity  implements Serializable, Cloneable{
	
	@Id
    @GeneratedValue
	private Long id;
	
	@Column(name = "productId")
	private String productId;
	@Column(name = "customerId")
	private String customerId;
	@Column(name = "itemDescription")
	private String itemDescription;
	@Column(name = "category")
	private String category;
	@Column(name = "categoryCode")
	private String categoryCode;
	@Column(name = "price")
	private float price;
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
	@Override
	public String toString() {
		return "Item [id=" + id + ", productId=" + productId + ", customerId=" + customerId + ", itemDescription="
				+ itemDescription + ", category=" + category + ", categoryCode=" + categoryCode + ", price=" + price
				+ "]";
	}
	
}
