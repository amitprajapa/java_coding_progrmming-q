package pattern_programm;

public class Practice {
	public static void main(String[] args) {
		for(int r=1; r<=4; r++)
		{
			for(int c=1; c<=7; c++)
			{
				if((r==1&&c==4)||(r==2&&c==3)||(r==2&&c==5)|| (r==3&&c>1&&c<7)||(r==4&&c==1)||(r==4&&c==7)) 
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	    }
		System.out.println("**********************");
		
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=4; c++)
			{
				if(r==1 || c==1 || r==5 || (r==3 && c<4) || ( r==2 &&c==4) ||(r==4 && c==4)) 
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	    }
		
		System.out.println("*********************");
		
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=5; c++)
			{
				if((r==1 && c==3) || (r== 2 && c==2 || r==2&& c==4 ) || (r==3&& c==2)|| (r==3&& c==4)||   ( r==4&&c==2||r==4 && c==4)||(r==5 && c==3))
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