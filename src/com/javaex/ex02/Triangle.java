package com.javaex.ex02;

public class Triangle extends Shape{
	private int width;
	private int heigth;
	public Triangle() {
		System.out.println("생성자 Shape(0) 실행");
	}
	public Triangle(int width, int heigth) {
		super("검정","검정");
		this.width = width;
		this.heigth = heigth;
		System.out.println("생성자 Shape(2) 실행");
	}
	public Triangle(String fillColor, String lineColor,int width, int heigth) {
		super(fillColor,lineColor);
		this.width = width;
		this.heigth = heigth;
		System.out.println("생성자 Shape(4) 실행");
	}
	
	
	
}


