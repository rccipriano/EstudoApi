package com.zup.EstudoAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.EstudoAPI.domain.User;
import com.zup.EstudoAPI.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repoUser;
	
	public List<User> findAll(){
		return repoUser.findAll();			 	
	}
	

}
