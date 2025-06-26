package twoDArray;

public class SpiralTraversal {

	    public static void spiralPrint(int[][] arr, int row, int col) {
	        int topRow = 0, bottomRow = row - 1;
	        int leftCol = 0, rightCol = col - 1;

	        while (topRow <= bottomRow && leftCol <= rightCol) {
	            // Print TOP ROW
	            for (int i = leftCol; i <= rightCol; i++) {
	                System.out.print(arr[topRow][i] + " ");
	            }
	            topRow++;

	            // Print RIGHT COLUMN
	            for (int i = topRow; i <= bottomRow; i++) {
	                System.out.print(arr[i][rightCol] + " ");
	            }
	            rightCol--;

	            // Print BOTTOM ROW
	            if (topRow <= bottomRow) {
	                for (int i = rightCol; i >= leftCol; i--) {
	                    System.out.print(arr[bottomRow][i] + " ");
	                }
	                bottomRow--;
	            }

	            // Print LEFT COLUMN
	            if (leftCol <= rightCol) {
	                for (int i = bottomRow; i >= topRow; i--) {
	                    System.out.print(arr[i][leftCol] + " ");
	                }
	                leftCol++;
	            }
	        }
	    }

	    // Sample main to test
	    public static void main(String[] args) {
	        int[][] arr = {
	            {1,  2,  3,  4},
	            {5,  6,  7,  8},
	            {9, 10, 11, 12},
	            {13,14, 15,16}
	        };

	        spiralPrint(arr, 4, 4);
	    }
	}	
