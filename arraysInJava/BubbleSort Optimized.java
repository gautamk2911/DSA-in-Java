package arrayInJava;

public class BubbleSort {
	
	static int[] bubbleSort(int[] arr){
		
		
		for(int i=0;i<arr.length;i++) {
			boolean swapped = false;
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) 
				break;
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
		
		int sortedArr[] = bubbleSort(arr);
		printArray(sortedArr);
	}
}
