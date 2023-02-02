package Two_D_Arrays;

public class InterviewQ {
	public static void main(String[] args) {
		int[][] a= {{11,22,33}, {44,55,66}, {77,88,99}};
		int k=66;
		int r=0;
		int c=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(a[i][j]==k)
				{
					r=i;
					c=j;
				}
				
			}
		}
		int sum=0;
		if((r+c) % 2==0)
			
		{
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if(a[i][j] % 2==0)
					{
						sum=sum+sumOfDigits(a[i][j]);
					}
				}
			}
			System.out.println(sum);
		}
		else
		{
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if(a[i][j] % 2!=0)
					{
						sum=sum+sumOfDigits(a[i][j]);
					}
				}
			}
			System.out.println(sum);
		}	
	}
	public static int sumOfDigits(int n) {
		int sum=0;
		while(n!=0)
		{
			int d = n % 10;
			sum=sum+d;
			n = n/10;
		}
		return sum;
		
	}

}
