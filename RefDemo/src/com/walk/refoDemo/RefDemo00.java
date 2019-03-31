package com.walk.refoDemo;

class Ref1{
	int temp = 10;
}
public class RefDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 r1 = new Ref1();
		r1.temp = 20;
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
	}
	public static void tell(Ref1 r2) {//引用的传递
		r2.temp = 30;
	}

}
