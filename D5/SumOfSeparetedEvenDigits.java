//wap to find sum of even digits 
package D5;

public class SumOfSeparetedEvenDigits {
public static void main(String[] args) {
	int n=97696;
	int sum=0;
	while(n !=0)
	{
		int d=n%10;
		if(d%2==0)
		{
		sum=sum+d;	
		}
		n=n/10;
		
	}
	System.out.println(sum);
}
}
