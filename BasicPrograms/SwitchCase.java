
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the operator (+,-,*,/): ");
		char operator = sc.next().charAt(0);
		System.out.print("Enter the numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		switch(operator) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1- num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("invalid input.");
		}
	}
}
