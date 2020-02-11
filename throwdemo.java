class throwdemo
{
	static void validate(int age)
	{
		if(age<18)
		
			throw new ArithmeticException("not eligible");
		
		else
		
			System.out.println("bank account is opened");
		}
		public static void main(String[] args) {
			validate(23);
			System.out.println("rest of the code");
		}
	
}