package com.walk.refoDemo;
/**
 * 抽象类的应用
 * @author mine
 *
 */
abstract class Person{
	private int age;
	private String name;
	public Person(int age,String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void  want();
}

class Student extends Person{
	
	private int score;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int age,String name,int score) {
		// TODO Auto-generated constructor stub
		super(age, name);
		this.score = score;
	}
	public void want() {
		System.out.println("姓名："+getName()+"\t年龄："+getAge()+"\t成绩："+getScore());
	}
}

class Worker extends Person{
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int monney) {
		this.money = monney;
	}
	public Worker(int age, String name,int money) {
		// TODO Auto-generated constructor stub
		super(age, name);
		this.money = money;
	}
	public void want() {
		System.out.println("姓名："+getName()+"\t年龄："+getAge()+"\t工资："+getMoney());
	}
}

public class AbsDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(10,"小明",100);
		student.want();
		Worker worker = new Worker(35,"大明",1000);
		worker.want();
	}

}
