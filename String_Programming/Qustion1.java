package String_Programming;
public class Qustion1 {
	public static void main(String[] args) {
		String s= "11,5,7";
		String[] a=s.split(",");
		int large1=Integer.MIN_VALUE;
		
		int large2=Integer.MIN_VALUE;
		
		int small1=Integer.MAX_VALUE;
		
		int small2=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			int x=Integer.parseInt(a[i]);
			if(x>large1)
			{
				large2=large1;
				large1=x;
			}
			else if(x> large2 && x!=large1)
			{
				
				large2=x;
			}
			if(x<small1)
			{
				small2=small1;
				small1=x;
			}
			else if(x< small2 && x!=small1)
			{
				small2=x;
			}
		}
		System.out.println(large1);
		System.out.println(large2);
		System.out.println(small1);
		System.out.println(small2);
		int sum1= large1*large1 + large2*large2;
		int sum2= small1*small1 + small2*small2;
		System.out.println(sum1-sum2);
	}
}

