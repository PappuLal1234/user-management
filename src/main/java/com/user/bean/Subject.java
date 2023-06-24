package com.user.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Subject")

public class Subject {
	@Id
	private int id;
	
	private String firstName;
	private String lastName;
	private String address;
	private long number;
	public Subject() {
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String firstName, String lastName, String address, long number) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public long getNumber() {
		return number;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	

	
}
