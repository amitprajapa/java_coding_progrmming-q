package String_Programming;

import java.util.Scanner;

public class trimMethod {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String  s= sc.nextLine();
		s=s.trim();
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}else
		{
			System.out.println("String Not Palindrome");
		}
	}

}
