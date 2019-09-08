package com.saran.login;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		
		if(user.equals("saran") && password.equals("arun")) {
			return true;
		}
		return false;
		
	}

}
