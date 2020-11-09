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
@Table(name = "cart")
@NamedQuery(name = "Cart.findAll", query = "SELECT l FROM Cart l")
public class CartEntity implements Serializable, Cloneable{
	@Id
    @GeneratedValue
	private Long id;
	
	@Column(name = "itemId")
	private String itemId;
	
	@Column(name = "orderId")
	private String orderId;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "totalCost")
	private float totalCost;
	
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
	
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	@Override
	public String toString() {
		return "CartEntity [id=" + id + ", itemId=" + itemId + ", orderId=" + orderId + ", quantity=" + quantity
				+ ", totalCost=" + totalCost + "]";
	}

}
