package D5;
//wap to find the product of separated number
public class productOfSeparateDigits {
public static void main(String[] args) {
	int n=223;
	int product=1;
	while(n!=0)
	{
		int d=n %10;
		product=product*d;
		n=n/10;
	}
	System.out.println(product);
}
}
