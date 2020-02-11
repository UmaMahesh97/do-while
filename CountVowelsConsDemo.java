package QuestionPaper;

import java.util.Scanner;
class CountVowelsCons
{
	void CountVowelsCons(String str)
	{
		int con=0,vow=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				vow++;
				else
					con++;
		}
		System.out.print("\nNumber of vowels:"+vow);
		System.out.print("\nNumber of consonants:"+con);
	}
}
class CountVowelsConsDemo 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a string:");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		CountVowelsCons c=new CountVowelsCons();
		c.CountVowelsCons(str);
	}
}
