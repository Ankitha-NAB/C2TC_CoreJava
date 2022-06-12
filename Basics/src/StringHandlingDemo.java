
public class StringHandlingDemo {

	public static void main(String[] args) {
		String s1="Dr.AIT";
		System.out.println("The length of s1 id:"+s1.length());
		System.out.println("The index of T is:"+s1.indexOf('T'));
		String s2="Monday";
		String s3=s2.substring(3,6);
		String s8=s2.substring(3);
		System.out.println(s3);
		System.out.println(s8);
		String s4="  Hi      ";
		String s5=s4.trim();
		System.out.println(s5);
		

		

	}

}
