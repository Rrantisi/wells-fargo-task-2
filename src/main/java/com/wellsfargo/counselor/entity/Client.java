package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue()
	private long clientId;
	
	private Advisor advisor;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column (nullable = false)
	private String email;
	
	@Column (nullable = false)
	private String address;
	
	@Column (nullable = false)
	private String phone;
	
	protected Client() {
		
	}
	
	public Client(Advisor advisor, String firstName, String lastName, String email, String address, String phone) {
		this.advisor = advisor;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public Long getClientId() {
		return clientId;
	}
	
	public Advisor getAdvisor() {
		return advisor;
	}
	
	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
