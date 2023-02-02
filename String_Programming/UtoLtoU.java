
package String_Programming;

public class UtoLtoU {
	public static void main(String[] args) {
		String s="thAnE";
		//System.out.println(s.toUpperCase());
		char[] c= s.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			if(c[i]>='a' && c[i]<='z')//it converting only lower case string 
			{
				c[i]=(char) (c[i]-32);
			}
			else if(c[i]>='A' && c[i]<='Z')//it converting only lower case string 
			{
				c[i]=(char) (c[i]+32);
			}
			
		}
		s = new String(c);//converting char[] to String
		System.out.println(s);
	}

}
