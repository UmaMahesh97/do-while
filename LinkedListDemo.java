import java.util.*;
public class LinkedListDemo
{
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("rani");
		al.add("gopi");
		al.add("sundar");
		al.add("rahul");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}