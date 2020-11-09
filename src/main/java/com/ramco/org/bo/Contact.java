/**
 * 
 */
package com.ramco.org.bo;

/**
 * @author sudharshanreddy
 *
 */
public class Contact {
	
	private Long id;
	private String customerId;
	private String firstName;
	private String shippingAddressId;
	private int age;
	private String email;
	private String lastName;
	private String middleName;
	private String ssn;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getShippingAddressId() {
		return shippingAddressId;
	}
	public void setShippingAddressId(String shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", customerId=" + customerId + ", firstName=" + firstName + ", shippingAddressId="
				+ shippingAddressId + ", age=" + age + ", email=" + email + ", lastName=" + lastName + ", middleName="
				+ middleName + ", ssn=" + ssn + "]";
	}
	
}
