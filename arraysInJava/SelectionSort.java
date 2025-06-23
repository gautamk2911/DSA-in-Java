package arrayInJava;

public class SelectionSort {
	
	static int[] selectionSort(int[] arr){
		int size = arr.length;
		
		for(int i=0;i<size-1;i++) {
			int min = i;
			for(int j=i+1;j<size;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	
	
	static void printArray(int[] arr){
		for(int i: arr)
			System.out.print(i+" ");
		
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {5,1,3,4,2,8};
		printArray(arr);
		
		int sortedArr[] = selectionSort(arr);
		printArray(sortedArr);
	}
}
