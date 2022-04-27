package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] Array = new User[3];
		User c = new Customer("jws","j1234","정우성",1000);
		User c1 = new Customer("yjs","y1234","이효리",2000);
		User e = new Employee("master","m1234","운영자",5000000);
		
		
		Array[0] = c;
		Array[1] = c1;
		Array[2] = e;
		
		
		for(int i=0; i<Array.length; i++) {
			Array[i].showInfo();
		}

	}

}
