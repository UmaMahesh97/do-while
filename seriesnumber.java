import java.util.*;
class seriesnumber
{
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{

          if(i%2==0)
          {
            System.out.println(i);
          }
          else
          {
           
           System.out.println(i*(-1));
          }
          
		}
  }
}			