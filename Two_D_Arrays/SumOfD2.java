package Two_D_Arrays;

public class SumOfD2 {
	public static void main(String[] args) {
		int[][] a= {{1,2,3}, {4,5,6},{10,8,9}};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
				if(i+j==2)
				{
					sum=sum+a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("Sum of diagonal is "+sum);
	}

}
