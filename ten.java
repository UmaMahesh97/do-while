import java.util.*;
class ten{
	public static void main(String args[])
	{
		int n1=0,n2=1,i,n3=0,number;
		System.out.println("enter the number of months");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		for(i=2;i<number;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println("the ameoba size is"+n3);
	}
}