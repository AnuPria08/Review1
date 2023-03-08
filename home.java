package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="homedetails")
public class home {
	@Id
	@Column(name="SNo")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="PhoneNum")
	private long phone;
	@Column(name="Address")
	private String address;
	@Column(name="Pincode")
	private int pincode;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "home [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone 
				+ ", address=" + address + ", pincode=" + pincode + "]";
	}
	
}