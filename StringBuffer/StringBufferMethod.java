package StringBuffer;

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Java a programming");
		System.out.println(sb);
		sb.append(" language");//append method
		System.out.println(sb);
		
		sb.insert(5, "is ");//insert method
		System.out.println(sb);
		
		//System.out.println(sb.indexOf("p"));
		sb.delete(10, 21);//delete method 
		System.out.println(sb);
		
		sb.replace(0, 5, "English ");//replace method
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}

}
