package String_Programming;

public class palindrome {
	public static void main(String[] args) {
		String s= "mom";
		
		String reverse="";
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
	     if(reverse.equals(s))//equalsIgnoreCase()
	     {
	    	 System.out.println("Palindrome String");
	     }else
	     {
	    	 System.out.println("not palindrome");
	     }
	}

}
