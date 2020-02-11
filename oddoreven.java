import java.util.*;
class oddoreven
{
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	   String n=(a%2==0)?"even":"odd";
	   System.out.println(n);
	}
}