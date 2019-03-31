package com.walk.array;

import java.util.Scanner;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[5];
		System.out.println("输入"+score.length+"个分数");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			score[i] = scanner.nextInt();
		}
		System.out.print("输入的数据为：\t");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"  ");
		}
		// 冒泡排序
		for (int i = 0; i < score.length-1; i++) {
			for (int j = i+1; j < score.length; j++) {	//score[i]固定不变，从0开始，找到最大值放入score[i]
				if (score[i] < score[j]) {	
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		//输出结果
		System.out.println();
		System.out.print("排序后的数组为：\t");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"  ");
		}
	}

}
