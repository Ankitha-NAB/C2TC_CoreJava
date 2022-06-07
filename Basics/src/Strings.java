

public class Strings {

	public static void main(String[] args) {
		String message="    Hello World!" + "!!   ";
		System.out.println(message.endsWith("!!"));
		System.out.println(message.startsWith("!!"));
		System.out.println(message.length());
		System.out.println(message.indexOf("e"));
		String replacement;
		String target;
		System.out.println(message.replace(target="!",replacement="*"));
		System.out.println(message);//strings are immutable means we cannot modify it
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());

	}

}
