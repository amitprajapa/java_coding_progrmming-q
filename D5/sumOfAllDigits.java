package D5;

public class sumOfAllDigits {
public static void main(String[] args) {
	int n=7635;
	int sum=0;
	while(n!=0)
	{
		int d=n % 10;
		//System.out.println(d+" ");
		sum=sum+d;
		n=n/10;
		
	}
	System.out.println(sum);
	}
}
