import java.util.Scanner;
import java.util.*;
public class offer{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n,sum=0,lo,i;
	double offer;
	System.out.println("enter no.of items");
	n=s.nextInt();
	System.out.println("enter the price");
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	lo=a[0];
	for(i=0;i<n;i++){
		sum=sum+a[i];

		if(a[i]<lo)
			lo=a[i];
		
	}
	offer=sum*0.2;
	if(offer>lo)
		System.out.println("1st offer is better");
	else
		System.out.println("2nd offer is better");
	}
	
}

