package com.walk.Exception;

class Pointer{
	int i=10;
}
public class ExceptionDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pointer pointer=null;
//		pointer = new Pointer();	//noPointerException
//		System.out.println(pointer.i);
		
//		int a = 10;
//		int b = 0;
//		int temp = a/b;		//ArithmeticException: / by zero
//		System.out.println(temp);
		
		int a = 10;
		int b = 0;
		int temp=0;
		try {
			temp = a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Error");
		}		
		System.out.println(temp);
		
	}

}
