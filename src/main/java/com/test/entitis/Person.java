package com.test.entitis;

import com.test.interfaces.IEntity;

public class Person implements IEntity{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void toDates() {
		System.out.println(this.name);
	}
		
	

}
