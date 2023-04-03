package Practice;

import java.util.Scanner;

public class Password {
public static void main(String[] args) {
	String str="Nagraj123#";
	for (int i = 0; i <str.length()-1; i++) {
		int x=str.length()-1;
		if(str.charAt(i)<'z' && str.charAt(i)>'a' )
			if(str.charAt(i)<'Z' && str.charAt(i)>'A' )
				if(str.charAt(i)>1 && str.charAt(i)<9)
				 if(str.charAt(x)=='#')
			
			{
				System.out.println("It is An Strong Password");
			}
			else
			{
				System.out.println("it is not a strong possword");
			}
		{
			
		}
			
	}
}
}
