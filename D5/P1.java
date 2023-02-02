package D5;

import java.util.Arrays;

//wap to print all the odd digits from the number
public class P1 {
public static void main(String[] args) {
	int[] a = {0,1,0,3,12};
	System.out.println(Arrays.toString(a));
	a=delete(2, a);
	System.out.println(Arrays.toString(a));
		}
 	public static int[] delete(int index, int[] a ) {
		if(index<0 || index>=a.length)
		{
			System.out.println("Index Not found");
			return a;
		}
		int[] b=new int[a.length-1];
		for (int i = 0; i < b.length; i++) {
			if(i<index)
			{
				b[i]=a[i];
			}else
			{
				b[i]=a[i+1];
			}
		}
		return b;
	}
}

