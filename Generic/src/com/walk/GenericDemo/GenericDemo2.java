package com.walk.GenericDemo;


class Con1<T>{
	private T value;
	public Con1(T value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
}
public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Con1<String> con = new Con1<String>("构造方法中使用泛型"); 
		System.out.println(con.getValue());

	}

}
