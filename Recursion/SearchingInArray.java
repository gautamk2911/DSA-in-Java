package recursion;

public class SearchingInArray {
	
	static boolean findElement(int[] arr, int index, int key) {
		if(index == 0 ) {
			return false;
		}
		if(arr[index] == key) {
			return true;
		}
		return findElement(arr,index-1,key);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int key = 1;
		System.out.println(findElement(arr,arr.length-1,key));
	}
}
