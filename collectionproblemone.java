package deepu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class collectionproblemone {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> al1=new ArrayList<Integer>();
ArrayList<Integer> al2=new ArrayList<Integer>();
ArrayList<Integer> al3=new ArrayList<Integer>();
for(int i=0;i<5;i++)
al1.add(sc.nextInt());
for(int j=0;j<5;j++)
al2.add(sc.nextInt());
al1.addAll(al2);
Collections.sort(al1);

System.out.println(al1.get(2));
System.out.println(al1.get(6));
System.out.println(al1.get(8));

}
}
