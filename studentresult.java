import java.util.*;
class studentresult
{
	public static void main(String[] args) {
		int a,b,c;
		String name;
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int total=(a+b+c);
		int avg=(a+b+c)/3;
		if(avg>70)
		{
			System.out.println("first class");
		}
		else if(avg>50)
			{
			System.out.println("second class");
		    }
		    else if(avg>30)
			{
			System.out.println("third class");
		    }
	}
}