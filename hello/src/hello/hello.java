package hello;

import java.util.Scanner;

public class hello {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		in = new Scanner(System.in);
//		final 
		int amount = 100;
		int price;
		System.out.print("请输入总额：");
		amount = in.nextInt();
		System.out.print("请输入价格：");
		price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));

	}

}
