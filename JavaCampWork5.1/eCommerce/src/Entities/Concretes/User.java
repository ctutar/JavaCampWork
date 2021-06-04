package Entities.Concretes;

import Entities.Abstracts.Entity;

public class User implements Entity {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	
	
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getPassword() {
		return password;
	}



	public String getEmail() {
		return email;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}
