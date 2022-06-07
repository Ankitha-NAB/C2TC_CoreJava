

public class ArithmeticExpression {

	public static void main(String[] args) {
		int result=10+3;
		int result1=10-3;
		int result2=10/3;
		int x=1;
		x+=2;
		//postfix and prefix we will get the same output as 2
		int y=x++;//first x will be incremented by 2 and then copied to y that's y in the output first x will executed
		int z=++x;
		double result3=(double)10 / (double)3;
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
