package pattern_programm;

public class P11_char {
	public static void main(String[] args) {
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=5; c++)
			{
				if(c==1 || c==5 || (r+c==6 && r>=3) || (r==c && r>=3 ))
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
		
		System.out.println();
		
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=5; c++)
			{
				if(r==1 || c==1||c==5 || r==3 )
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
		
		System.out.println("============");
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=5; c++)
			{
				if(r==1 || c==1 || r==3)
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
