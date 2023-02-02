package String_Programming;

public class String_Reverse {
	public static void main(String[] args) {
		String s= "butter chicken";
		String reverse="";
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}

}
