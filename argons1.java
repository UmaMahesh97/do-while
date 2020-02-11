class argons{
	argons1 obj;
	argons(argons1 obj)
	{
		this.obj=obj;
	}
	void display(){
		System.out.println(obj.data);
	}
}
class argons1{
	int data=10;
	argons1(){
		argons b=new argons(this);
		b.display();
	}
	public static void main(String[] args) {
		argons1 a = new argons1();	}
}