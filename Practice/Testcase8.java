package Practice;

import java.util.Arrays;

public class Testcase8 {
public static void main(String[] args) {
	String str="abcdef ghijklmnopq rstuvw xyz";
	boolean flag=true;
	int count=0;
	int[] arr=new int[str.length()];
	char[] str1=str.toCharArray();
	for (int i = 0; i < str1.length; i++) {
	char ch=str1[i];
	int x=(int)ch;
	arr[i]=x;
	}
	Arrays.sort(arr);
	
	for (int i = 0; i <=26; i++) {try{
		if(arr[i]+1!=arr[i+1])
		{
			flag=false;
			count++;
		}
	}catch(Exception e)
	{
		
	}
		
}
	if(flag)
	{
		System.out.println("Contains all The elements"+count);
	}
	else
	{
		System.out.println("Not contains all the elements");
	}
}
}
