package Two_D_Arrays;
//find the largest element every row
public class LargeElement {
	public static void main(String[] args) {
		int[][] a= {{1,2,3}, {4,5,6},{7,8,9}};
		for (int i = 0; i < a.length; i++) //outer lenght 3
		{
			int large=Integer.MIN_VALUE;
			int sum=0;
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
				if(large<a[i][j])
				{
					large=a[i][j];
				}
			}
			System.out.print("="+large);
			System.out.println();
		}
	}
}
