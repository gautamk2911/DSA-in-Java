
public class LoopsInJava {
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			for(int j=i;j < 5;j++ ) {
				if(i+j == 5) 
					break;
				
				System.out.println(i+" "+j);
			}
		}
	}
}
