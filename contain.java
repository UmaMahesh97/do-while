import java.util.*;
class contain{
	public static void main(String... argd){
	ArrayList aList=new ArrayList();
aList.add(4);
aList.add(5);
aList.add(6);
boolean flag1=aList.contains(6);
if(boolean flag1==true)
{
	System.out.println("alist contains element 2");

}
boolean flag2=aList.contains(5);
if(boolean flag2==true)
{
	System.out.println("aList contains element5");
}
else
{
	System.out.println("aList doesnt contains element");
}
}
}