package com.walk.classDemo;

class Per{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age >= 0 && age <150) {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
	public void tell() {
		System.out.println("姓名："+getName()+"\n"+"年龄："+getAge());
	}
}

public class ClassDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Per per = new Per();
		per.setAge(30);
		per.setName("张三");
		per.tell();
	}
	

}
