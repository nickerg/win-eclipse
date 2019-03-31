package com.walk.classDemo;
/**
 * 方法的调用
 * @author mine
 *
 */
public class ClassDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addNum(100));
	}
	/**
	 * 计算num到1之间所有整数的和。
	 * @param num
	 * @return
	 */
	public static int  addNum(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num + addNum(num-1);
		}
	}
}
