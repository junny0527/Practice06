package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	private String department;

	public Depart() {
		super();
	}

	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Depart [department=" + department + "]";
	}
	
	public void showInformation() {
        System.out.println(" 이름:" + getName() + " 연봉:" + getSalary() + " 부서:"+department);
    }

}
