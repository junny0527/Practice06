package com.javaex.ex04;

public class Customer extends User {
	private int point;
	public Customer() {
		
	}
	public Customer(String id, String password, String name,int point) {
		super(id,password,name);
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "#아이디:=" + id + ", #비밀번호:" + password + ", #이름:" + name + "#포인트:" + point  + "";
	}
	
	
	public void showInfo() {
		System.out.println(this.toString());
	}

}
