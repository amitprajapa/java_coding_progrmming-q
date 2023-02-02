package D6;
//wap to find the largest digits from the number
public class LargestNumber {
	public static void main(String[] args) {
		int n=87902;
	     int large=0;
	     while(n>0)
	     {
	    	 int digit = n % 10;
	    	 if( digit > large)
	    	 {
	    		 large = digit;
	    	 }
	    	 n = n /10;
	     }
	     System.out.println(large);

	}

}
