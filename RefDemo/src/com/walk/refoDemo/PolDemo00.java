package com.walk.refoDemo;

class A1{
	public void tell1() {
		System.out.println("A1 --- tell");
	}
}
class B1 extends A1{
	public void tell2() {
		System.out.println("B1 -- tell");
	}
}
class C1 extends A1{
	public void tell3() {
		System.out.println("C1 -- tell");
	}
}
public class PolDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tell(new B1());
		tell(new C1());
	}
	/**
	 * 多态性的应用
	 * @param a
	 */
	public static void tell(A1 a) {
		a.tell1();
	}

}
