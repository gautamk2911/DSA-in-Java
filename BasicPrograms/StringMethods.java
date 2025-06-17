
import java.util.Scanner;

public class StringMethods {
	
	static String giveName() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		return name;
	}
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		String name = giveName();
		System.out.println("The entered name is: "+ name);;
	}
}
