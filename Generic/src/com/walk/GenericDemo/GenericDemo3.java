package com.walk.GenericDemo;
/**
 * 通配符的使用
 * @author mine
 *
 */

class Info<T>{
	private T key;

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.getKey().toString();
		}
}
public class GenericDemo3 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>();
		i.setKey("hello");
		tell(i);
	}
	public static void tell(Info<?> i) {
		System.out.println(i);
	}

}
