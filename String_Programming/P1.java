package String_Programming;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		String[] a= {"amit", "ravi"};
		String temp=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(temp.length()> a[i].length())
			{
				temp=a[i];
			}
		}
		System.out.println(temp);
		
	}
}
	






