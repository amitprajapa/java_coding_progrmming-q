package String_Programming;

import java.util.Scanner;

public class StartWithMethod16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		String email=sc.next();
		if(email.length()>10)
		{
		if(email.startsWith("+91"))
		{
			System.out.println("Valid Number");
		}else
		{
			System.out.println("Not Valid ");
		}
		}
	}

}
