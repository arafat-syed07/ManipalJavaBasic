package firstClass;

public class prime {
	    public static boolean isPrime(int n){

        int i=2;
        if (n<= 1)
            return false;
        while(i < n){
            if (n % i ==0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
	    public static void main(String[] args)
	    {
	        if (isPrime(5))
	        System.out.println("Prime");
	        else
	        System.out.println("Not Prime");


	    }



}
