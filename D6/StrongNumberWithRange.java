//wap to find all the strong number in the range of 1 to 1000

//wap t

package D6;

public class StrongNumberWithRange {
public static void main(String[] args) {
   for(int n=1;n<=1000;n++)
	{
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(sum);	
		}
		n=temp;
	}
}
}
