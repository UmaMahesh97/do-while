class strings{
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("this is string buffeeer");
		StringBuffer s=new StringBuffer("This is a sample program");
		System.out.println(str.append(s));
		System.out.println(str.insert(21,"object"));
        System.out.println(str.reverse());
        System.out.println(str.replace("buffeeer","builder"));
	}
}