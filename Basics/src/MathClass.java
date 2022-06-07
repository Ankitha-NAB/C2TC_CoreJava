

public class MathClass {

	public static void main(String[] args) {
		int result=Math.round(1.1F);
		System.out.println(result);
		int result1=(int)Math.ceil(1.1F);//ceil returns smallest integer that is greater than or equals to that number
		System.out.println(result1);
		int result2=(int)Math.floor(1.1F);//Floor of the number is larger or equals or smaller to that number
		System.out.println(result2);
		int result3=Math.max(4,6);
		System.out.println(result3);
		int result4=Math.min(4,6);
		System.out.println(result4);
		double result5=Math.round(Math.random()*100);
		System.out.println(result5);

	}

}
