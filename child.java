class Parent{
	int s = 20;
	void show(){
		System.out.println("parent class method");
	}
}
class child extends Parent{
	int a = super.s;
	void show(){
		//super.show();
		System.out.println("child class method");
		System.out.println(a);
	}
	public static void main(String[] args) {
		Parent ob=new child();
		ob.show();	
	}
}