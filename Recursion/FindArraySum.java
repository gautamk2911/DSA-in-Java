package recursion;

public class FindArraySum {
	
	static int findArraySum(int[] arr, int size) {
		if(size == 0) {
			return arr[0];
		}
		return arr[size] + findArraySum(arr, size-1);		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(findArraySum(arr,arr.length-1));
	}
}
