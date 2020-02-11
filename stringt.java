class stringt
{
	public static void main(String[] args) {
		String str=new String("C:/IBM/DB2/PROGRAM/DB2COPY1.EXE");
        System.out.println("Drive:"+str.substring(0,3));
         System.out.println("Folder:"+str.substring(3,19));
         System.out.println("File:"+str.substring(19,31));
	}
}