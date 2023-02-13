package com.gopal.service;

import com.gopal.binding.LoginCheck;

public interface CaseWorkerService {
	
    public String unlockAccount(String emailId);
	
	public String login(LoginCheck loginCheck);
	
	public String recoverPwd(String email);
	
	public String editProfile();
	
	
	
	

}
