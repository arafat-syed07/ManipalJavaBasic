package firstClass;

public class whileLopp {

	public static void main(String[] args) {
		int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        
        int j = 1;
        do {
        	System.out.println("do while : " + j);
            j++;
        } while (j <= 10);

	}

}
