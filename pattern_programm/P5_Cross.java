package pattern_programm;

public class P5_Cross {
	public static void main(String[] args) {
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=5; c++)
			{
				if(r+c==6 || r==c)
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}

}
