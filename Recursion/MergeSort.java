package recursion;

public class MergeSort {
	public static void mergeSort(int[] arr, int s, int e) {
		if (s >= e) 
			return;
		
		int mid = (s+e)/2;
		mergeSort(arr,s,mid);
		mergeSort(arr,mid+1,e);
		mergeArray(arr, s, mid, e);
	}
	
	
	public static void mergeArray(int[] arr, int left, int mid, int right) {
		int n1 = mid - left +1;
		int n2 = right - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0;i < n1; i++) {
			L[i] = arr[left + i];
		}
		for(int j = 0;j<n2;j++) {
			R[j] = arr[mid + 1 + j];
		}
		
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {5,4,8,2,1,53,21};
		mergeSort(arr, 0, arr.length-1);
		for(int ele:arr) {
        	System.out.print(ele+" ");
        }
	}
}
