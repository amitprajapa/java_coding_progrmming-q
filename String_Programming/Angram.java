package String_Programming;

public class Angram {
	public static void main(String[] args) {
		String s1="bc";
	       String s2="ad";
	       char[] c1=s1.toCharArray();
	       char[] c2=s2.toCharArray();
	       int sum1=0;
	       int sum2=0;
	       for(int i=0; i<c1.length;i++)
	       {
	    	   sum1=sum1+c1[i];
	       }
	       for (int j = 0; j < c2.length; j++) 
	       {
			sum2=sum2+c2[j];
	    	}
	       if(sum1==sum2)
	       {
	    	   System.out.println("both are anagrams");
	       }else
	       {
	    	   System.out.println("both are not anagrams");
	       }

	}

}
