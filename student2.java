class student2
{
	int rollno;
	String name;
    static String college="GITAM";
    static void change()
    {
    	college="srm";
    }
    student2(int r,String n)
    {
    	rollno=r;
    	name=n;

    }
    void display(){
    	System.out.println(rollno+""+name+""+college);
    }
    public static void main(String[] args) {
    	student2 s1=new student2(101,"rani");
    	student2 s2=new student2(101,"rani");
    	s1.display();
    	s2.display();
    }
}