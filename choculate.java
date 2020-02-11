import java.util.*;
import java.util.Scanner;
class choculate
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int choculate;
		int childrens,i;
		System.out.println("enter number of childrens");
		childrens=s.nextInt();
		System.out.println("enter number of choculate");
		choculate=s.nextInt();
		for(i=1;i<=childrens;i++)
		{
          if(choculate>i)
          {
          	choculate=choculate-i;
          }
          else
          {
          	--i;
          	System.out.println("the remaining choculate are "+choculate+"the remaining children are"+(childrens-i));
          }
		}


	}
}