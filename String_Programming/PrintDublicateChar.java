package String_Programming;
//wap to print only the dublicates character from the string
public class PrintDublicateChar {
	public static void main(String[] args) {
		String s="maharashtra";
		char[] c=s.toCharArray();
		boolean[] b=new boolean[c.length];
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false)
			{
				int count=1;
			
			for (int j = i+1; j < b.length; j++) {
				if(c[i]==c[j])
				{
					count++;
					
					b[j]=true;
					
				}
				
			}
			if(count>1)
			System.out.println(c[i] +" "+ count);
			}
		}
	}

}
