package String_Programming;

public class FirstCharLastLastRemove {
	public static void main(String[] args) {
		String s="COMBINATION";
		//System.out.println(s.length());
		System.out.println(s.length());
		int i=0;
		while(s.length() != 1)
		{
			if (i % 2==0) 
			{
				s=s.substring(1);
			} else {
				s = s.substring(0, s.length()-1);
			}
            System.out.println(s);
            i++;
         }
	}
}
