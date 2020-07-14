package com.hcl.inheritance;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehical {
private String wheel;

public String getWheel() {
	return wheel;
}

public void setWheel(String wheel) {
	this.wheel = wheel;
}

	
}
