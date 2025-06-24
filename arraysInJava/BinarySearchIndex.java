package arrayInJava;

public class BinarySearchIndex{
	
	public static int binarySearch(int[] arr, int key) {
		int idx = -1;
		
		int start=0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		while(start <= end) {
			if(arr[mid] == key) {
				idx = mid;
			}
			if(arr[mid] < key) {
				start = mid+1;
			} else {
				end = mid-1;
			}
			mid = (start+end) /2;
			
		}
		return idx;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int key = 5;
		
		int idx = binarySearch(arr,key);
		if(idx == -1 ) {
			System.out.println(key+" is not present in array.");
		} else {
			System.out.println(key+" is present at position: "+idx);
		}
	}
}
