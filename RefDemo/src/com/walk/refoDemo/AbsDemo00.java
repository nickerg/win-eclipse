package com.walk.refoDemo;

abstract class Abs{
	private int age;
	public void tell() {
		
	}
	//抽象方法
	public abstract void say();
}
class AbsDemo extends Abs{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbsDemo00 {
	public static void main(String[] args) {
		AbsDemo absDemo = new AbsDemo();
		absDemo.say();
	}
}
