import java.util.*;
import java.util.Scanner;
class bill
{
public static void main(String args[])
{
	int billnumber;
	int date;
	int a,b;
	
	 Scanner input =new Scanner(System.in);
	 System.out.println("enter the date ");
	 date=input.nextInt();
	 System.out.println("enter the billnumber");
	 billnumber= input.nextInt();
	  a=billnumber%100;
    b=billnumber%10;
 if(( date<=31&&date>0)&&( a==date||b==date||billnumber%date==0))
 {
 	System.out.println("lucky customer");
 }
 else
 {
 	System.out.println("not came");
 }
}
}
