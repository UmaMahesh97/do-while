import java.util.Scanner;
import java.util.*;
public class pbfour{
public static void main(String[] args) {
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter number");
	n=s.nextInt();
	if(n%2==0)
		System.out.println("equal parts"+n/2+" "+n/2);
	for(int i=0;i<n;i++){
	System.out.println(i +"  "+(n-i));}


}
}