package pattern_programm;

public class P1 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for(int j=1; j<=5; j++)
			{
				if(i==2 || j==3)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
