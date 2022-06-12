package p;

public class Student {
	int age=20;
	String name="dinga";

	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("*****");
		Student s=new Student();//object creation
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println("----------------");
		System.out.println("Age:"+s.age);
		System.out.println("Name:"+s.name);
		System.out.println("----------------");
		System.out.println(s.name+" is "+s.age+" years old");
		System.out.println("*****");
		System.out.println("end");

	}

}
