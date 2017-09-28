package com.ata.repository;

import org.springframework.data.repository.CrudRepository;

import com.ata.bean.CredentialsBean;

public interface CredentialRepository extends CrudRepository<CredentialsBean, String> {
 
	boolean authenticate(CredentialsBean credentialsBean);
	String authorize(String userID);
	boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus);
	
}
