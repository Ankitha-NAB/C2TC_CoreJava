package statements;

public class MarksValidation {

	public static void main(String[] args) {
		int marks=85;
		if(marks>=81 && marks<=100) {
			System.out.println("Destination");
		}
		else if(marks>=35 && marks<=80) {
			System.out.println("First class");
		}
		else if(marks>=0 && marks<=34) {
			System.out.println("Fail,study well!! :(");
		}
		else{
			System.out.println("Invalid marks");
		}
	}

}
