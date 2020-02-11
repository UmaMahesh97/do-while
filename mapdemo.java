import java.util.*;
class mapdemo
{
	public static void main(String[] args) {
		Map<String,Integer> values=new TreeMap<>();
		values.put("second",2);
		values.put("first",1);
		System.out.println("map using Treemap" +values);
		values.replace("first",11);
		values.replace("second",22);
        System.out.println("New Map"+values);
        int removedValue=values.remove("first");
        System.out.println("removed value"+removedValue);
	}
}