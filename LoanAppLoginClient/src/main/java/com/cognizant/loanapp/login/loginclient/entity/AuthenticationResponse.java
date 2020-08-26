package com.cognizant.loanapp.login.loginclient.entity;

public class AuthenticationResponse {

	private final String jwt;

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}	
}
