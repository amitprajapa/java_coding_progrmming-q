package pattern_programm;

public class P7 {
	public static void main(String[] args) {
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=5; c++)
			{
				if(r==5 || r==3 || (c==3&&r<=1) || (c==3&&r<=5) || (c>=5&&r>=1))
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


