import java.util.*;
class streq{
	public static void main(String args[])
	{
      int aa=20;
      String a =String.valueOf(aa);
      String s1="java";
      //String s2="java";
      String s3=new String("java");
      String s2="java";
      String s5=new String("java");
      String s4=s2.intern();
      System.out.println(s3.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s1.hashCode());
      System.out.println(s4.hashCode());
      System.out.println(s5.hashCode());
      System.out.println(s1==s2);
       System.out.println(s2==s3);
        System.out.println(s5==s3);
        System.out.println(s1.equals(s4));
         System.out.println(s2.endsWith("j"));
         System.out.println(s2.startsWith("j"));
         System.out.println(s2.length());
         System.out.println(s4);
         System.out.println(a+20);
         System.out.println();
         StringBuffer sb=new StringBuffer("helo");
         sb.replace(1,3,"java");
         System.out.println(sb);
          sb.reverse();
          System.out.println(sb);
	} 
}