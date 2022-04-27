package com.javaex.ex04;

public class Employee extends User {

	private int salary;

	public Employee() {
		super();
	}

	public Employee(String id, String password, String name,int salary) {
		super(id,password,name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " #아이디:" + id + ", #비밀번호" + password + ", #이름" + name+ ", #월급:" + salary + "";
	}
	
	public void showInfo() {
		System.out.println( "#아이디:" + id + ", #비밀번호" + password + ", #이름" + name+ ", #월급:" + salary);
		System.out.println("운영자의 월급은 5000000원 입니다.");
	}
	
	

	
}
