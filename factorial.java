class factorial
{
	public static void main(String[] args) {
		int num=5;
		long fac=multiplefac(num);
		System.out.println("the factorial of"+num+"is"+fac);

	}
	public static long multiplefac(int num)
	{
		if(num>=1)
		{
			return num*multiplefac(num-1);
		}
		else
		{
			return 1;
		}
	}
}