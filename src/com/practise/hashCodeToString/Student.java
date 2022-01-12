package com.practise.hashCodeToString;

public class Student {

	private int rollno;
	private String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	@Override
	public int hashCode() {
	
		return rollno;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std=(Student)obj;
		return this.getRollno()==std.getRollno();
	}
	
	// hashcode method and equals method has a kind of a contract in between and thats why both
	//needed to add unique values in hashset or hashmap
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + rollno;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (rollno != other.rollno)
//			return false;
//		return true;
//	}
	
	
	
}
