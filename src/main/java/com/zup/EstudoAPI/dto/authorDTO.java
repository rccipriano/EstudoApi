package com.zup.EstudoAPI.dto;

import java.io.Serializable;

import com.zup.EstudoAPI.domain.User;

public class authorDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	public authorDTO() {
		
	}
	
	public authorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
