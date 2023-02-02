package String_Programming;

public class Count_DublicatesWords {
	public static void main(String[] args) {
		String s="java is a programming language it is used to do programming";
	    int total=0;
		String[] c=s.split(" ");
		boolean[] b=new boolean[c.length];
		for (int i = 0; i < c.length; i++) {
			if(b[i]==false)
			{
				int count=1;	
				for (int j = i+1; j < c.length; j++) {
					
					if(c[i].equals(c[j]))
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1)
				{
					total++;
				}
		
			}
			
		}
		System.out.println(total);
		}
	}
	


