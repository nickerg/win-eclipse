package com.walk.string;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class StringDemo03 {
	/**
	 * string 的常用方法
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str = "asdfghjkl";
//		System.out.println(str.length());	// 字符串长度
//		char abc[] = str.toCharArray();
//		System.out.println(abc.length);		// 字符串转换数组
//		for (int i = 0; i < abc.length; i++) {
//			System.out.print(abc[i]+" ");
//		}
		byte bytes[] = str.getBytes();
		System.out.println(bytes.length);
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i]+" ");
		}
		System.out.println();
		System.out.println(new String(bytes));
//		int a = 'b';
//		byte b = 'b';
//		System.out.println(a+" "+b);
//		String c = Integer.toString(a);
//		System.out.println(c);
	}

}
