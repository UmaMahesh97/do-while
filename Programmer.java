class programmer{
	int id;
	String name;
	void display(){
		System.out.println(id+""+name);
	}
	  public static void main(String[] args) {
		programmer s1=new programmer();
		programmer s2=new programmer();
		
		s1.display();
		s2.display();

	}
}