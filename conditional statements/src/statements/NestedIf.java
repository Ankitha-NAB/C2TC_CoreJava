package statements;

public class NestedIf {

	public static void main(String[] args) {
		int a=5;
		if(a<=10) {
			System.out.println("Inside outer if");
			if(a==5) {
				System.out.println("a is equal to 5");
			}
			else {
				System.out.println("a is not equal to 5");
			}
		}
		else {
			System.out.println("a greater than 10");
		}

	}

}
