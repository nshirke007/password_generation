package com.scp.abtract;

public class AbstractNew {

	public static void main(String[] args) {
		Student st1 = new Student1();
	}
}

abstract class Student {
	abstract  void method();

	abstract void method1();

	void method2() {
		System.out.println("abstract");
	}
}

class Student1 extends Student {

	@Override
	void method() {
		System.out.println("implimented method1 in student1");
	}

	@Override
	void method1() {
		System.out.println("implimented method2 of student1 ");

	}

}