package String_Programming;

public class UperCharToLowerChar {
	public static void main(String[] args) {
		String s="THANE";
		char[] c=s.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			if(c[i]>='A' || c[i]<='Z')
			{
				c[i]=(char) (c[i]+32);
			}
			
			
		}
		s=new String(c);
		System.out.println(s);
	}

}
