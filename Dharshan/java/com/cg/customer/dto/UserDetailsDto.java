package com.cg.customer.dto;

public class UserDetailsDto {
	
	private String username;
	private String password;
	
	public UserDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetailsDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetailsDto [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
