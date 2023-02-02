//wap to swap two string without using 3rd var
package String_Programming;
public class StringSwap16 {
	public static void main(String[] args) {
		String a="hi";
		String b="bye";
		System.out.println("Before swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		a=a.concat(b);
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
