import java.util.*;
class search
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int search,i,n;
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
         
		}
		System.out.println("enter a number to be searched");
		search=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(search==a[i])
			{
				System.out.println("number is found");
			}
		}
	}
}