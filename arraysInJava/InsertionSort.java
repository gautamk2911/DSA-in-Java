package arrayInJava;

public class InsertionSort {
	
	static int[] insertionSort(int[] arr){
		
		
		int size  = arr.length;
		
		for(int i=1;i<size;i++) {
			int j =i-1;
			int key = arr[i];
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		
		return arr;
	}
	
	
	
	static void printArray(int[] arr){
		for(int i: arr)
			System.out.print(i+" ");
		
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5,1,3,4,2,8,6};
		printArray(arr);
		
		int sortedArr[] = insertionSort(arr);
		printArray(sortedArr);
	}
}
