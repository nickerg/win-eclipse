package com.walk.GenericDemo;
/**
 * 经纬度
 * int
 * float
 * String
 * @author mine
 *
 */

class Point{
	private Object xObject;
	private Object yObject;
	public Object getxObject() {
		return xObject;
	}
	public void setxObject(Object xObject) {
		this.xObject = xObject;
	}
	public Object getyObject() {
		return yObject;
	}
	public void setyObject(Object yObject) {
		this.yObject = yObject;
	}
	
}
public class GenericDemo00 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.setxObject(10);
		point.setyObject(10);
		int pxi = (Integer)point.getxObject();
		int pyi = (Integer)point.getyObject();
		System.out.println("x="+pxi+"\ty="+pyi);
		point.setxObject(10.2f);
		point.setyObject(10.2f);
		float pxf = (Float)point.getxObject();
		float pyf = (Float)point.getyObject();
		System.out.println("x="+pxf+"\ty="+pyf);
		
	}

}
