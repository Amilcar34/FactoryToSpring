package com.test.entitis;

import com.test.interfaces.IEntity;

public class Player implements IEntity{

	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void toDates() {
		System.out.println(this.position);
	}
	
	
}
