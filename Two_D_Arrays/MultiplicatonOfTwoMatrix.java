package Two_D_Arrays;
public class MultiplicatonOfTwoMatrix {

	  public static void main(String[] args) {
	    int[][] a = {{1, 2,3}, {4, 5, 6},{7,8,9}};
	    int[][] b = {{1, 2, 1}, {1, 3, 1},{0,1,1}};
	    for (int i = 0; i < b.length; i++) //row
	    {
	    	for (int j = 0; j < b.length; j++) //cols
	    	{
	    		int sum=0;
	    		for (int k = 0; k < b.length; k++)//element
	    		{
					sum=sum+a[i][k] * b[k][j];
				}
	    		System.out.print(sum+" ");
			}
			System.out.println();
		}
	  }
	}
