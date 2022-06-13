package com;

public class Demo {
	/*Method without arguments and without return statements*/
	void display() {
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {
		System.out.println("start");
		Demo d=new Demo();
		d.display();
		System.out.println("end");
		

	}

}
