package com.walk.refoDemo;

class Ref2{
	String temp = "hello";
}
public class RefDemo01 {
	/**
	 * string的栈空间存储的是指向堆空间的地址，不可更改
	 * 对象存储的是指向堆空间的具体类的引用，类中的string引用的地址在堆空间中，可更改。
	 * @param args
	 */
	public static void main(String[] args) {
		Ref2 ref1 = new Ref2();
		System.out.println(ref1.temp);
		ref1.temp = "hi";	//开辟新空间存储"hi"
		System.out.println(ref1.temp);
		tell(ref1);			//指向新的引用
		System.out.println(ref1.temp);	//对象中的string的引用可更改
	}
	public static void tell(Ref2 ref2) {
		ref2.temp = "world";
	}
}
