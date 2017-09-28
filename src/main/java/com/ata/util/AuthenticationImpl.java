package com.ata.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ata.bean.CredentialsBean;
import com.ata.repository.CredentialRepository;

@Component
public class AuthenticationImpl implements Authentication {

	@Autowired
	CredentialRepository credentialRepository;
	
	@Override
	public boolean authenticate(CredentialsBean credentialsBean) {
      
		boolean result = false ;
		
		try
		{
			if((credentialsBean != null)
			   && ((credentialsBean.getUserId() != null) && (credentialsBean.getUserId().length() >= 6))
			   && ((credentialsBean.getPassword() != null) && (credentialsBean.getPassword().length() >= 6))
			   )
			{
				result = credentialRepository.authenticate(credentialsBean);
				return result;
			}
			else
			{
				return result;
			}
		}
		catch(Exception error)
		{
			System.out.println(" Error : " + error);
			error.printStackTrace();
			return result;
		}
	}

	@Override
	public String authorize(String userID) {
		
		String result = null;
		return result;
	}

	@Override
	public boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus) {
		// TODO Auto-generated method stub
		return false;
	}

}
