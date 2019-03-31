package com.walk.GenericDemo;
/**
 * 经纬度
 * int
 * float
 * String
 * @author mine
 *
 */

class Point1<T>{
	private T xObject;
	private T yObject;
	public T getxObject() {
		return xObject;
	}
	public void setxObject(T xObject) {
		this.xObject = xObject;
	}
	public T getyObject() {
		return yObject;
	}
	public void setyObject(T yObject) {
		this.yObject = yObject;
	}

	
}
public class GenericDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1<String> p = new Point1<String>();
		p.setxObject("经度为：100");
		p.setyObject("纬度为：100");
		System.out.println(p.getxObject()+"\t"+p.getyObject());
		
	}

}
