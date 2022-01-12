package com.practise.Datatstructures;

public class Student implements Comparable<Student> {

	Integer rollno;
	String name;
	public Student(Integer rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
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
	public int compareTo(Student o) {
		
		return this.rollno>o.rollno ?1:-1;
	}
}
