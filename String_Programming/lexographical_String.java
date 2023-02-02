package String_Programming;
//wap to sort all the strings in lexographical order
public class lexographical_String {
	public static void main(String[] args) {
		String[] a= {"welcome", "hi", "bye", "hello"};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
					
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
//how to make a class as imutable 
//1. we have to make the class as final
//2. all the data members should be private and final 
//3. to access the private member create only getter() method