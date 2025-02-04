package com.example.securitydemo.jwt;

public class LoginResponse {
    private String jwtToken;

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public LoginResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}

    
}


