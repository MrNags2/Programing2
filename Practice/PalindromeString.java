package Practice;

import java.util.Arrays;

public class PalindromeString {
public static void main(String[] args) {
	String str="listen";
	String str2="silentu";
	char ch[]=str.toCharArray();
	char ch2[]=str2.toCharArray();
	
	Arrays.sort(ch);
	Arrays.sort(ch2);
	
	if(str.length()==str2.length())
	{
	for (int i = 0; i < ch2.length; i++) {
		if(ch[i]!=ch2[i])
		{
			System.out.println("not an palindrome");
		}	}		
	}
	else
	{
		System.out.println("it ia an palindrome");
	}

	
}
}
