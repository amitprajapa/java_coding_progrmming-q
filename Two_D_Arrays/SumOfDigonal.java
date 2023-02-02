package Two_D_Arrays;

public class SumOfDigonal {
	public static void main(String[] args) {
		int[][] a= {{1,2,3}, {4,5,6},{10,8,9}};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Sum of first diagonal is "+sum);
		int sum1=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i+j==2)
				{
					sum1=sum1+a[i][j];
				}
			}
		}
		System.out.println("Sum of second diagonal is"+sum1);
	}
	
}
