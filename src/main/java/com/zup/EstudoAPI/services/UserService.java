package com.zup.EstudoAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.EstudoAPI.domain.User;
import com.zup.EstudoAPI.dto.UserDTO;
import com.zup.EstudoAPI.repository.UserRepository;
import com.zup.EstudoAPI.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repoUser;
	
	public List<User> findAll(){
		return repoUser.findAll();			 	
	}
	
	public User findById(String id) {
		Optional<User> obj = repoUser.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	 
	}
	
	public User insert(User obj) {
		return repoUser.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repoUser.deleteById(id);
		
	}
	
	public User update(User obj) {
		User newObj = findById(obj.getId());
		
		updateData(newObj, obj);
		return repoUser.save(newObj);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}
		
	
	public User fromDTO(UserDTO objDto) {
		
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail()); 
		
	}
	
}
