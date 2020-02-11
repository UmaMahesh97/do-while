class thisexample{
thisexample(){
	System.out.println("current class");
}
thisexample(int x){this();
System.out.println(x);
}
}
class pub{
	 public static void main(String[] args) {
	thisexample a=new thisexample(24);	
	}
}

