package BinarySearch;
public class Array1 {
	public static void main(String[] args) {
        	int[] a= {1,2,3,4,5};
            int search=4 ;
            int sp=0;
            int ep=a.length-1;
            int mp=(sp + ep)/2;
            System.out.println(mp);
            
            while(sp<=ep)
            {
            	if(search == a[mp])
            	{
            		System.out.println("Index found at "+mp);
            		break;
            	}
            	else if(search>a[mp])
            	{
            		sp=mp+1;
            	}
            	else if(search<a[mp])
            	{
            		ep=mp-1;
            	}
            	mp=(sp + ep)/2;
            }
            if(sp>ep)
            {
            	System.out.println("The element not found");
            }
		}
}

