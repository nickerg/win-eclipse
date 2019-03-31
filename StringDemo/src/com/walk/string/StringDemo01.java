package com.walk.string;

public class StringDemo01 {
	/**
	 * string 比较
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");
		System.err.println(str == str1);
		System.out.println(str.equals(str1));
		
	}
}
