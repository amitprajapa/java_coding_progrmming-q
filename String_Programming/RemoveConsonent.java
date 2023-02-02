package String_Programming;

public class RemoveConsonent {
	public static void main(String[] args) {
		String s="welcome to geeksforgeeks";
		
		for(int i=0; i<s.length(); i++)
		{
          if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' &&
        		  s.charAt(i)!='o' && s.charAt(i)!='u')
			{
				System.out.print(s.charAt(i));
			}
		}
		//System.out.println(count);
		}
	}

//1BAN2G3ALO4RE 
//OUTPUT =9BANGALORE10
