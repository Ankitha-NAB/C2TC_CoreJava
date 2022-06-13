package com;

public class Addition {
	/*Method with arguments and without return statements*/
	void add(int a,int b) {
		System.out.println("sum of "+ a +" & "+ b +" is "+ (a+b));
		/* int sum=a+b;
		 * System.out.println("sum of"+ a +"&"+ b +"is"+ (a+b));
		 * System.out.println(a+b);
		 */
	}

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(10, 20);
		obj.add(6, 3);
		obj.add(123, 456);
	}

}
