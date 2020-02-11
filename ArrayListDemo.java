import java.util.*;
class Book
{
	int id;
	String name,author,publisher;
	int quality;
	public Book(int id,String name,String author,String publisher,int quality)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quality=quality;
	}

}
public class ArrayListDemo
{
	public static void main(String[] args) {
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book(101,"Thinking java","Maneet kanna","pearson",4);
		Book b2=new Book(102,"Thinking java","Maneet kanna","pearson",4);
		Book b3=new Book(103,"Thinking java","Maneet kanna","pearson",4);
		Book b4=new Book(101,"Thinking java","Maneet kanna","pearson",4);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		for(Book b:list)
		{
			System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quality);
		}
	}
}
