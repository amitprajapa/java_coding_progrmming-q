package String_Programming;
public class StringQ {
	    public static void main(String[] args) {
	    	String s = "1BAN2G3ALO4RE";
	    	System.out.println(countAlphabets(s)+sum(s));    	
	}    
	    public static String countAlphabets(String s) {
	    	int count=0;
	    	String res="";
	    	for(int i=0; i<s.length(); i++)
	    	{
	    		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	    		{
	    			count++;
	    			res = res + s.charAt(i);
	    		}
	    	}
	    	return count+res; 
		}
	    public static int sum(String s) {
	    	int sum=0;
	    	for (int i = 0; i < s.length(); i++) {
	    		if(s.charAt(i)>='0' && s.charAt(i)<='9')
	    		{
	    			sum=sum + (s.charAt(i)-48);
	    		}
				
			}
	    	return sum;
			
		}
 }
	 
