class catch1
{
	 public static void main(String[] args) {
	
	try{
		int a[]=new int[5];
		a[8]=23/0;
	}	
	catch(ArithmeticException e){
		System.out.println("divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException is occured");
	}
	System.out.println("rest of the code");
	}
}