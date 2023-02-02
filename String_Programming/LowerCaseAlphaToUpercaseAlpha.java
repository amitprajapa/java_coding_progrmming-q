package String_Programming;
//wap convert LowerCase alphabates into uppercase alphabates without using inbuild method
public class LowerCaseAlphaToUpercaseAlpha {
	public static void main(String[] args) {
		
		String s="thanE";
		//System.out.println(s.toUpperCase());
		char[] c= s.toCharArray();
		for(int i=0; i<c.length; i++)
		{
			if(c[i]>='a' && c[i]<='z')//it converting only lower case string 
			{
				c[i]=(char) (c[i]-32);
			}
			
		}
		s = new String(c);//converting char[] to String
		System.out.println(s);
		
		
	}

}
