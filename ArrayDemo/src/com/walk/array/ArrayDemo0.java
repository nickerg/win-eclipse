package com.walk.array;

public class ArrayDemo0 {
	/**
	 * 数组练习
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayDemo[];
		int[] score;		//数组的声明	栈内存
		score = new int[3];	//为数组开辟空间，实例化	堆内存
		for (int i = 0; i < score.length; i++) {
			score[i] = 2*i;
			
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
