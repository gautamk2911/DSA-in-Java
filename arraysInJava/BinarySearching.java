package arrayInJava;

public class BinarySearching {
	
	public static boolean binarySearch(int[] arr, int key) {
		boolean found = false;
		
		int start=0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		while(start <= end) {
			if(arr[mid] == key) {
				found = true;
			}
			if(arr[mid] < key) {
				start = mid+1;
			} else {
				end = mid-1;
			}
			mid = (start+end) /2;
			
		}
		
		
		
		return found;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int key = 5;
		
		boolean found = binarySearch(arr,key);
		if(found) {
			System.out.println(key+" is present.");
		} else {
			System.out.println(key+" is not present.");
		}
	}
}
