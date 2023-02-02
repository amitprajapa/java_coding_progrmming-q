package String_Programming;

public class StringRotaion {
	public static void main(String[] args) {
		String s1="XYZ";
		String s2="YZX";
		s1 = s1+s1;
		if(s1.indexOf(s2) !=-1)
		{
			System.out.println("Both the string are rotation");
		}else
		{
			System.out.println("Both the are not rotation");
		}
	}

}
//PQRST
