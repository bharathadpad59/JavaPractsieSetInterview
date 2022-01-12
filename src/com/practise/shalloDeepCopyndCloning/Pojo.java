package com.practise.shalloDeepCopyndCloning;

public class Pojo implements Cloneable {

	int id;
	String name;
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
