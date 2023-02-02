//wap to find the sum of all rows and col
package Two_D_Arrays;

public class SumRow_SumCol {
public static void main(String[] args) {
	int[][] a= {{1,2,3}, {4,5,6},{7,8,9}};
	for (int i = 0; i < a.length; i++) //outer lenght 3
	{
		int row=0;
	
		for (int j = 0; j < a[i].length; j++)
		{
			System.out.print(a[i][j]+" ");
			row=row+a[i][j];
			
			
			//System.out.print(a[j][i]+" ");
		}
		System.out.println("= "+ row);	
}
	System.out.println("\n");
	for (int i = 0; i < a.length; i++)
	{
		int col=0;
		for (int j = 0; j < a[i].length; j++)
		{
			//System.out.print(a[j][i]+" ");
			col=col+a[j][i];
			
			//System.out.print(a[j][i]+" ");
		}
		System.out.println("Sum of Col= "+ col);
	}
}
}
