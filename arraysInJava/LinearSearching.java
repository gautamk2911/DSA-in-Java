package arrayInJava;

public class LinearSearching {
	
	
	public static int linearSearch(int[] array, int key) {
		int idx = -1;
		if(array.length == 0) {
			return -2;
		}
		
		for(int i =0;i<array.length;i++) {
			if(array[i] == key) {
				return i+1;
			}
		}
		
		return idx;
	}
	public static void main(String[] args) {
		int arr[] = {4,5,2,6,7,8,1};
		int key = 5;
		int idx = linearSearch(arr, key);
		if(idx == -1) {
			System.out.println(key+" is not there in array.");
		} else if(idx == -2) {
			System.out.println("array is empty.");
		} else {
			System.out.println(key+" is present at position: "+(idx));
		}
	}
}
