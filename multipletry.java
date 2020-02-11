class multipletry
{
	public static void main(String[] args) {
		try
		{
			try
			{
				System.out.println("going to divide");
				int b=35/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a[]=new int[5];
				a[8]=4;

			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("further process");
		}
		catch(Exception e)
		{
			System.out.println("Other Exceptions");
		}
	}
}