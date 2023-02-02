//WAP to check given number is Niven Number Or not
package D5;
public class NinvenNumber {
public static void main(String[] args) {
	int n=24;/// 2+4=6, 24/6=4
	int temp=n;
	int sum=0;
	while(n !=0)
	{
		int d=n % 10;
		sum=sum+d;
		n=n/10;
	}
	if(temp % sum==0)
	{
		System.out.println("It Is Niven Number");
	}else
	{
		System.out.println("Not Niven Number");
	}
}
}
