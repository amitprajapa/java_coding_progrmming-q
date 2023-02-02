package D5;

public class Practice {
	public static void main(String[] args) {
		int n=1462;
		int sum=0;
		while(n!=0)
		{
			int d= n%10;
			if(d%2==0)
			{
				sum=sum+d;
			}
			//System.out.print(d+" ");
			n=n/10;
		}
		System.out.println(sum);
	}

}
