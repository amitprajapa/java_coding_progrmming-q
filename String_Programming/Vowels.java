package String_Programming;
//wap to find the total number of vowels
public class Vowels {
	public static void main(String[] args) {
		String s="audio";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
          if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
        		  s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
