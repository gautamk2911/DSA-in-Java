package arrayInJava;

public class CountZeroes {
	public static void main(String[] args) {
		int[] arr = {1,0,0,1,1,1,0};
		int zeroCount = 0;
		int oneCount = 0;
		for(int i: arr) {
			if(i==0) {
				zeroCount++;
			}else {
				oneCount++;
			}
		}
		
		System.out.println(zeroCount+" "+oneCount);
		
	}
}
