import java.util.*;
class demo
{
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("E");
		set.add("F");
		System.out.println("Initial Set:"+set);
		System.out.println("Reverse Set:"+set.descendingSet());
		System.out.println("Head Set:"+set.headSet("C",true));
		System.out.println("Sub Set:"+set.subSet("A",false,"E",true));
		System.out.println("Tail Set:"+set.tailSet("C",false));
	}
}