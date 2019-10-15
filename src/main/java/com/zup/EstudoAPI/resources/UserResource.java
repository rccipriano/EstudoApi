package com.zup.EstudoAPI.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zup.EstudoAPI.domain.User;

@RestController	
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public ResponseEntity<List<User>> findall(){
		User Rodrigo = new User("1", "Rodrigo Correa Cipriano", "rccipriano@msn.com");
		User Renan = new User("2", "Renan Correa Cipriano", "reccipriano@hotmail.com");
		List<User> list = new ArrayList<User>();
		list.addAll(Arrays.asList(Rodrigo,Renan));
		return ResponseEntity.ok().body(list);
				
	}

}
