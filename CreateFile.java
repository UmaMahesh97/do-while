//package FileHandling;
import java.io.File;
import java.io.IOException;
public class CreateFile{
	public static void main(String[] args) {
		try{
			File myObj=new File("D:FIleHandlingNewFilef1.txt");
			if(myObj.createNewFile()){
				System.out.println("file created"+myObj.getName());
			}else{
				System.out.println("file already exists");
			}
		}
			catch(IOException e)
			{
				System.out.println("an Error occured");
				e.printStackTrace();
			}
		}
	}
