import java.util.*;
class two
{
	public static void main(String args[])
	{
		int n,num,i,count=0,sum=0;
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
		System.out.println("entered number is");
        num=s.nextInt();
        if(num>0)
        {
        	sum=sum+num;
        	count++;
        }
         
	    }
	    System.out.println("sum number of positive values "+sum);
	    System.out.println("total number of positive values "+count);
	}
}