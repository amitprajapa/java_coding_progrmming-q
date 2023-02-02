package D5;

public class P2 {
	public static int count(int i) {
		int sum=0;
		while(i!=0)
		{
			int d=i % 10;
			sum=sum+d;
			i=i/10;
		}
		return sum;
	}
	
public static void main(String[] args) {
	int sum=0;
	int temp=0;
	for(int i=1; i<=100; i++)
	{
		if(i % count(i)==0)
		{
			System.out.println(i);
		}
	}
}
}
