package String_Programming;

public class CompanyQ {
	public static void main(String[] args) {
		String str ="welcome to mettel";
		String[] a =str.split(" ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i] +" ");
		}
	}

}
