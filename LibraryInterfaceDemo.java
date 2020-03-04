interface LibraryUser
{
	void MethodName();
void registerAccount();
void requestBook();
}
public class KidUsers implements LibraryUser
{
  int age;	
String bookType;
void registerAccount()
{
	if(age<12)
	{
		System.out.println("yoou have sucessfully registered under kids account");
	}
	else
	{
		System.out.println("Sorry age must be less than 12 to register as a kid");
	}
}	
void requestBook()
{
   if(bookType =="Kids")
   {
    System.out.println("Book Issued successfully, please return the book within 10 days");
   }
   else
   {
     System.out.println("Oops, you are allowed to take only kids books");
   }
}
} 
public class AdultUser implements LibraryUser
{
  int age;	
String bookType;
void requestBook()
{
       if(bookType="fiction")
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		
		}
		else
		{
		System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        
	    }
}
void registerAccount()
{
	if(age>12)
	{
		System.out.println("you have sucessfully registered under an adult account");
	}
	else 
	{
		
	    System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}

	
}

}
class LibraryInterfaceDemo
{
	public static void main(String[] args) {
		KidUsers ku=new KidUsers();
		ku.age=10;
		ku.age=18;
		ku.bookType="kids";
		ku.bookType="Fiction";
		AdultUser au=new AdultUser();
		au.age=5;
		au.age=23;
		au.bookType="kids";
		au.bookType="Fiction";

	}
}