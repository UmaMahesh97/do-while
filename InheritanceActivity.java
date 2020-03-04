class employe
{
	long employeeId	;
String employeeName	;
String employeeAddress;
long employeePhone;
int basicSalary;
int transportAllowance;
employe(long employeeId	,String employeeName ,String employeeAddress,long employeePhone,int basicSalary)
{
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.employeeAddress=employeeAddress;
	this.employeePhone=employeePhone;
	this.basicSalary=basicSalary;
}
void calculateSalary()
{
	 int hra=100;
	 int specialAllowance=1000;
	int salary;
	salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
	System.out.println(salary);
}

}
class manager extends employe
{
  manager(long employeeId	,String employeeName ,String employeeAddress,long employeePhone,int basicSalary)
  {
   super(employeeId,employeeName,employeeAddress,employeePhone,basicSalary);
   System.out.println("employeeId  "+employeeId+"  employeeName   "+employeeName+"  employeeAddress  "+employeeAddress+"  employeePhone  "+employeePhone+" salary "+basicSalary);
  }
   void calculateTransportAllowance()
{
	
	transportAllowance = 10/100*basicSalary;
	System.out.println("the salary after calculating transport allowances is"+transportAllowance);
}
}
class trainee extends employe
{
   trainee(long employeeId	,String employeeName ,String employeeAddress,long employeePhone,int basicSalary)
   {
     super(employeeId,employeeName,employeeAddress,employeePhone,basicSalary);
      System.out.println("employeeId  "+employeeId+"   employeeName   "+employeeName+"   employeeAddress  "+employeeAddress+"   employeePhone  "+employeePhone+" salary "+basicSalary);
   }
    void calculateTransportAllowance()
{
	
	transportAllowance = 15/100*basicSalary;
	System.out.println("the salary after calculating transport allowances is"+transportAllowance);
}
}
class InheritanceActivity
{
	public static void main(String[] args) 
	{
		manager obj=new manager(126534,"Peter","Chennai India",237844,65000);
		obj.calculateSalary();
		obj.calculateTransportAllowance();

       trainee obj1=new trainee(29846,"Jack","Mumbai India",442085,45000);
       obj1.calculateSalary();
       obj1.calculateTransportAllowance();



	}
}