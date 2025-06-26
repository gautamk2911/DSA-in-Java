package twoDArray;

public class SearchingIn2D {
	
	static boolean isPresent(int[][] arr, int key, int row, int col) {
		boolean present  = false;
		
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				if(arr[i][j] == key) {
					present = true;
					break;
				}
			}
		}
		
		return present;
	}
	
	
	public static void main(String[] args) {
		int arr[][]= {  {1,2,3,4},{5,6,7,8},{9,10,11,12}  };
		int  key = 50;
		
		if(isPresent(arr, key, 3,4)) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}
	}
}
