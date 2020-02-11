
import java.io.File;
public class FileInformation{
	public static void main(String[] args) {
		File myObj=new File("NewFilef1.txt");
		if(myObj.exists())
		{
			System.out.println("file name:"+myObj.getName());
			System.out.println("Absolute path"+myObj.getAbsolutePath());
			System.out.println("writeable"+myObj.canWrite());
			System.out.println("readable:"+myObj.canRead());
			System.out.println("file size in bytes:"+myObj.length());
		}
		else
		{
			System.out.println("the file does not exists");
			System.out.println("Absolute path"+myObj.getAbsolutePath());
			System.out.println("writeable"+myObj.canWrite());
			System.out.println("readable:"+myObj.canRead());
			System.out.println("file size in bytes:"+myObj.length());

		}
	}
}