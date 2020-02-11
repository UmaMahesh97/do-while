class taxcalculator
{
	float basicsalary=250000;
	boolean citizenship=true;
	float tax;
	void calculatetax()
	{
		 tax = 30*basicsalary/100;
		System.out.println("Tax is"+tax);
	}
   void deducttax()
   {
   	int netsalary= (int)basicsalary-(int)tax ;
   	System.out.println("The nett salary of the employee"+netsalary);
   }
   void validatesalary()
   {
   	if(basicsalary>100000)
   	{
   		System.out.println("The salary and citizenship eligibility:");
   	}
   	else 
   	{
   		System.out.println("False");
   	}

   }
}
class employeetax
{
	public static void main(String[] args) {
		taxcalculator n=new taxcalculator();
		n.calculatetax();
		n.deducttax();
		n.validatesalary();
	}

}