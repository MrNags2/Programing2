package Practice;

import java.util.Scanner;

public class Testcase2 {
	static int recMethod(int n)
	{
		if(n==0)
		{
			return 1;
			//System.out.println(1);
			//System.out.println("n is less than 1");
		}
		else
		{
			int po = 2 * recMethod(n-1);
			return po;
			//System.out.println(po);
			//System.out.println(n);
		}
	}
public static void main(String[] args) {
	System.out.println(recMethod(4));
	
}
}
