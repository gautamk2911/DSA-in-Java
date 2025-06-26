package twoDArray;

public class SumOfRows {
	
	
	public static void main(String[] args) {
		int arr[][]= {  {1,2,3,4},{5,6,7,8},{9,45,12,52},{9,10,11,12}  };
		
		int maxSum = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j = 0;j<arr[i].length;j++) {
				sum += arr[i][j];
			}
			System.out.print(sum+" ");
			System.out.println();
			maxSum = Math.max(maxSum, sum);
		}
		
		System.out.println("max sum is: "+maxSum);
	}
}
