package com.practise.fileIO;

import java.io.Serializable;

public class POJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	
	transient String exclude;

	@Override
	public String toString() {
		return "POJO [id=" + id + ", name=" + name + ", exclude=" + exclude + "]";
	}
	
	
}
