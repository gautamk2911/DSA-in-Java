package twoDArray;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter values: ");
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Entered values are: ");
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	
	}
}
