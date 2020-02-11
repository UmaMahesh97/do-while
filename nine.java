import java.util.*;
class nine{
	public static void main(String args[])
	{
		int m,n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the starting number");
		m=input.nextInt();
		System.out.println("enter the ending number");
		n=input.nextInt();
		for(i=m;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}