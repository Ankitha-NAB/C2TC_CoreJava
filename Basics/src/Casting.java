

public class Casting {

	public static void main(String[] args) {
		//this is implicit casting
		//byte>short>int>long>float>double(it will automatically converted)
		short x=1;
		int y=x+2;
		System.out.println(y);
		double a=1.1;
		double b=a+2;
		System.out.println(b);
		double c=1.1;
		int d=(int)c+2;//this is type casting
		System.out.println(d);
		String p="1.1";
		double q=Double.parseDouble(p)+2;
		System.out.println(q);

	}

}
