package com.hcl.inheritance;

import javax.persistence.Entity;

@Entity

public class TwoWheeler extends Vehical {
	private String handle;

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}
	

}
