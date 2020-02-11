import java.util.*;
class oddsum
{
	public static void main(String[] args) {
		int a,b,c,n,sum=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
       for(i=0;i<n;i++)
       {
       	if((i%2)!=0)
       	{
       		sum=sum+i;
       	}
       }
       System.out.println("sum of numbers is"+sum);
 
 }
}		