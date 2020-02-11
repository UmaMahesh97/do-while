class animal{
	void cruel()
	{
		System.out.println("animal");
	}
}
class dog extends animal{
	void barking()
	{
		System.out.println("dog is barking");
	}
}
class babydog extends dog{
	void weeping()
	{
     System.out.println("weeping");
	}
	public static void main(String[] args) {
		babydog b=new babydog();
		b.cruel();
		b.barking();
		b.weeping();
	}
}