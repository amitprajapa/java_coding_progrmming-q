package String_Programming;
//
//how to make a class as imutable 
//1. we have to make the class as final
//2. all the data members should be private and final 
//3. to access the private member create only getter() method
public class FindSmallestLength_String_18 {
public static void main(String[] args) {
	String[] a= {"welcome", "hi", "bye", "hello","ac"};
	String temp=a[0];
	for (int i = 1; i < a.length; i++) {
		if(temp.length()> a[i].length())
		{
			temp=a[i];
		}
				
	}
	System.out.println(temp);
}
}
