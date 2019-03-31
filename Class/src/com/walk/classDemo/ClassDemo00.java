package com.walk.classDemo;

class Person{
	String name;
	int age;
	public void tell() {
		System.out.println("姓名："+name+"\n"+"年龄："+age);
	}
}


public class ClassDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 创建对象
		 * 赋值
		 * 调用
		 */
		Person person = null; //声明
		person = new Person(); //实例化
		person.name = "张三";
		person.age = 20;
		person.tell();	
	}

}
