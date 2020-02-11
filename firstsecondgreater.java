import java.util.*;
class firstsecondgreater
{
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int max= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest number"+max);
		if(a>b&&a>c&&b>c)
		{
			System.out.println("second greatest"+b);
		}
		else if(b>a&&b>c&&a>c)
		{
         System.out.println("second greatest"+a);
		}
		else if(c>a&&c>b)
		{
			if(a>b)
			{
			System.out.println("second greatest"+a);
		    }
		    else
		    {
		    	System.out.println("second greatest"+b);
		    }
		}
		
	}
}