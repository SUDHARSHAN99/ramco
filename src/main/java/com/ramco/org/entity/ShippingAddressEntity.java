/**
 * 
 */
package com.ramco.org.entity;

/**
 * @author sudharshanreddy
 *
 */
public class ShippingAddressEntity {
	
	private Long id;
	private String addressOne;
	private String addressTwo;
	private Long zip;
	private String primaryMobile;
	private String secondaryMobile;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddressOne() {
		return addressOne;
	}
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}
	public String getAddressTwo() {
		return addressTwo;
	}
	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}
	public Long getZip() {
		return zip;
	}
	public void setZip(Long zip) {
		this.zip = zip;
	}
	public String getPrimaryMobile() {
		return primaryMobile;
	}
	public void setPrimaryMobile(String primaryMobile) {
		this.primaryMobile = primaryMobile;
	}
	public String getSecondaryMobile() {
		return secondaryMobile;
	}
	public void setSecondaryMobile(String secondaryMobile) {
		this.secondaryMobile = secondaryMobile;
	}
	@Override
	public String toString() {
		return "ShippingAddress [id=" + id + ", addressOne=" + addressOne + ", addressTwo=" + addressTwo + ", zip="
				+ zip + ", primaryMobile=" + primaryMobile + ", secondaryMobile=" + secondaryMobile + "]";
	}
	
	

}
