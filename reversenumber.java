import java.util.*;
class reversenumber
{
	public static void main(String[] args) {
		int rem=0,rev=0,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse number is "+rev);
	}
}