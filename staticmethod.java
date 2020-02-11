class student2
{
	int rollno;
	String name;
    
    student2(int rollno,String name)
    {
    	this.rollno=rollno;
    	this.name=name;

    }
    void display(){
    	System.out.println(rollno+""+name);
    }
}
class staticmethod{
    public static void main(String[] args) {
    
    	student2 s1=new student2(101,"rani");
    	student2 s2=new student2(102,"ram");
    	s1.display();
    	s2.display();
    }
}