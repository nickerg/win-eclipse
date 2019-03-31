package com.walk.string;

public class StringBuffer01 {
	/**
	 * StringBuffer的了解
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello");
//		System.out.println(stringBuffer);
//		System.out.println(stringBuffer.toString());
		stringBuffer.append(" World");
		System.out.println(stringBuffer.toString());
		String string = "Hello";
//		string = "hello World";	//是string的指向变了，不是更改了其内容
		add(string);
		System.out.println(string);	// string内容不可变
		string+= " World!";
		System.out.println(string);	//string指向改变
	}
	public static void  add(String s) {
		s= "Hello World";
	}

}
