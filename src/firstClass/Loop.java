package firstClass;

public class Loop {

	public static void main(String[] args) {
		
		int i;
		
		for ( i = 1; i <= 20; i++) {
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		for ( i = 20; i >=1; i--) {
			System.out.println(i);
		}
		

	}	
		
}
